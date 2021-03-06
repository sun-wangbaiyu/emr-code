Ext.define('iih.mr.dr.condition_set.action.ConditionPanelDeleteAction', {
	extend: 'Xap.ej.action.ServiceInvocation',
	
	doExecute: function(context) {
		var me = this;
		var owner = this.getOwner();
		var ownerCt = owner.ownerCt;
		var block = ownerCt.getBlock('right');
		var upcond = block.down('xaptextfield[name=upcond]').value
		if(Ext.isEmpty(upcond,false)){
			XapMessageBox.info('请选择要删除的节点！');
			return;
		}
    	var operations = context.operations;
        if(!operations) {
        	return;
        }
    	//删除按钮
		/*var btnBlock = ownerCt.getBlock('left').getBlock('right');
		var deleteCond = btnBlock.down('button[method=delete]');
		deleteCond.on('click',function(btn){
	        XapMessageBox.confirm2('确认删除吗？', function(button){
	        	if(button=='yes'){
	        		me.prepareOperations(operations);
	        	}else{
	            	return;
	            }
	        });
		});*/
        me.prepareOperations(operations);
    },
    
    prepareOperations: function(operations){
    	var owner = this.getOwner();
		var block = owner.ownerCt.getBlock('right');
		var upcond = block.down('xaptextfield[name=upcond]').value
        var url = this.url+'/'+upcond;
        var mclass = null;
        var METHODS = this.getInvocationMethods();
    	var operation = {
            url: url,
            mclass: null,
            method: METHODS.METHOD_DELETE,
            condition: null,	
    		scope: this,
    		success: this.onSuccess
    	};
    	operations.push(operation);
    },
    
    onSuccess: function(operation) {
        //刷新条件设置画面
    	var owner = this.getOwner().ownerCt.ownerCt;
    	//提示删除成功
//    	XapMessageBox.info('删除成功');
    	
    	//调用刷新树Action，刷新条件树
    	var initChain = owner.getActionChain('init');
    	initChain.execute();
    	
    	//调用ResetAction，清空设置条件
    	var resetChain = owner.getActionChain('reset');
    	resetChain.execute();
    }
	
});
