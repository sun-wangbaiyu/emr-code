Ext.define('iih.sy.userinfo.action.UserInfoLeftSearchAction', {
	extend: 'Xap.ej.action.ServiceInvocation',
	
	/*
	* @Override
	*/
	execute: function(context) {
		this. showLoading();
    	var owner = this.getOwner();
    	var operations = context.operations;
    	if(!operations) {
    		return;
    	}
    	
    	this.prepareOperations(operations,context);
    },
    
    prepareOperations: function(operations,context) {
        var block = this.getBlock('condition');
        var orgCd = block.down('comboxgrid');
        if(orgCd.comboRecord){
        	orgCd = orgCd.comboRecord.value;
        }else{
        	orgCd = '';
        }
        //获取分页数
        var pageNum,pageSize ;
		if(context.event && context.event.name == "turnpage"){
    		pageNum = context.event.arguments[0];
    		pageSize = context.event.arguments[1];
		}else {
			pageNum = context.pageNum; 
			pageSize = context.pageSize; 
		}
       // console(orgCd.comboRecord);
    	var condition = block.getData();
    	condition.pageNum=pageNum;
    	condition.pageSize=pageSize;
    	this.getOwner().pageSize=pageSize;
        var url = this.url;
        if(condition) {
            var qs = Ext.Object.toQueryString(condition);
            if(qs) {
                url += '?' + qs +'&orgCd=' + orgCd;
            }
            console.log(url);
        }
        var mclass = null;
        if(block.getModelClass) {
            mclass = block.getModelClass();
        }
    	var operation = {
            url: url,
    		mclass: mclass,
    		method: 'get',
    		condition: condition,
    		scope: this,
    		success: this.onSuccess
    	};
    	operations.push(operation);
    },

    onSuccess: function(operation) {
        var data;
   	 	var pageSize=this.getOwner().pageSize;
        var block = this.getOwner().getBlock('result');
        // TODO 数据格式就这样了？
        if(operation.result){
	        resultData=operation.result;
	        resultData.pageSize=pageSize;
    	 	 block.setData(resultData);
        }else{
       	 	block.setData(null);
        }
    }
});
