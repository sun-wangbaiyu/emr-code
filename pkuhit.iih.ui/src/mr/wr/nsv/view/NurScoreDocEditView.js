Ext.define('iih.mr.wr.nsv.view.NurScoreDocEditView', {
    extend: 'Xap.ej.template.BaseTemplate',

    requires: [],
    alias: 'widget.nurscoredoceditview',
    layout:  'fit',
    id:'nurscoredoceditview',
    xapConfig: {
        blocks: {
            'content': {
                xclass: 'iih.mr.block.editor.MrDocEditBlock',
                flex: 1
            }
        },

        actions: {
            'init': {
                xclass: 'iih.mr.wr.nsv.action.NurScoreDocEditAction',
                url:'nsv',
                blocks: {
                    content: 'content'
                }
            },
            'omrUseSign':{
            	xclass: 'iih.mr.wr.omr.action.OmrUseSignAction',
                url:'mrSign/user',
                blocks: {
                    content: 'content'
                }
            },
            'openMrDoc': {
                xclass: 'iih.mr.wr.mr.action.OpenMrAction',
                url: 'omr',
                blocks: {
                    content: 'content'
                }
            },
            'emrCmdDispatch': {
                xclass: 'iih.mr.action.editor.EmrCmdDispatchAction',
                blocks: {
                    content: 'content'
                }
            },
            'editorCallBackAction': {
                xclass: 'iih.mr.wr.nsv.action.NurScoreEditorCallBackAction',
                url:'param',
                blocks: {
                    content: 'content'
                }
            },
            'emrEditorOperator': {
                xclass: 'iih.mr.action.editor.EmrEditorOperatorAction'
            },
            'emrSave': {
                xclass: 'iih.mr.wr.nsv.action.NurScoreDocSaveAction',
                url: 'nsv',
//                url: 'http://127.0.0.1:8081/mr',
                blocks: {
                    content: 'content'
                }
            },
            'emrDocProperty': {
            	xclass: 'iih.mr.wr.omr.action.OmrDocPropertyAction',
                url: 'omr',
                blocks: {
                    content: 'content'
                }
            },
            'emrSubmit':{
                xclass: 'iih.mr.wr.omr.action.OmrDocSubmitAction',
                url: 'submit/omr',
                blocks: {
                    content: 'content'
                }
            },
            'emrSignDispose':{
            	xclass: 'iih.mr.wr.mr.action.MrSignDisposeAction',
                url: 'signUser',
                blocks: {
                    content: 'content'
                }
            },
            'emrRevoke': {
                xclass: 'iih.mr.wr.omr.action.OmrDocRevokeAction',
                url: 'submit/omr',
                blocks: {
                    content: 'content'
                }
            },
            'emrRefreshMacro': {
                xclass: 'iih.mr.wr.omr.action.RefreshMacroAction',
                url:'macroElement',
                blocks: {
                    content: 'content'
                }
            }/*,
            'emrRefreshMrDocValue': {
                xclass: 'iih.mr.wr.omr.action.RefreshMrDocValueAction',
                url:'mrDocValue',
                blocks: {
                    content: 'content'
                }
            }*/,
            'emrRefreshDiagnosis': {
                xclass: 'iih.mr.wr.omr.action.RefreshMrDiagnosisAction',
                url:'diagnosises',
                blocks: {
                    content: 'content'
                }
            },
            'emrPrintSelected': {
                xclass: 'iih.mr.wr.mr.action.SelectedPrintAction',
                blocks: {
                    content: 'content'
                }
            },
            'emrRefreshOutpatientDisposal': {
                xclass: 'iih.mr.wr.omr.action.RefreshPrescriptionAction',
                url:'omr/prescription',
                blocks: {
                    content: 'content'
                }
            },
            'getSystemConfig': {
                xclass: 'iih.mr.wr.omr.action.GetSystemConfigAction',
                url:'param',
                blocks: {
                    content: 'content'
                }
            },
            'disabledOfficeToolBarAction': {
                xclass: 'iih.mr.wr.nsv.action.DisabledOfficeToolBarAction',
                url:'param',
                blocks: {
                    content: 'content'
                }
            },
            'emrNeatPrint': {
                xclass: 'iih.mr.wr.nsv.action.NurScoreDocNeatPrintAction',
                url: 'mr_doc_file',
                blocks: {
                    content: 'content'
                }
            },
            'submitAndRevokeCheck': {
                xclass: 'iih.mr.wr.nsv.action.SubmitAndRevokeCheckAction',
                url: 'param',
                blocks: {
                    content: 'content'
                }
            },
            'mergeAllMr': {
                xclass: 'iih.mr.wr.omr.action.MergeAllMrAction',
                blocks: {
                    content: 'content'
                }
            },
            'emrExportXML':{
            	xclass: 'iih.mr.wr.mr.action.EmrEmrExportXMLAction',
                blocks: {
                    content: 'content'
                }
            }/*,
            'emrContinuePrint': {
                xclass: 'iih.mr.wr.omr.action.OmrContinuePrintAction',
                url: 'omrs',
                blocks: {
                    content: 'content'
                }
            },
            'emrSelectContinuePrint': {
                xclass: 'iih.mr.wr.omr.action.OmrSelectContinuePrintAction',
                url: 'omrs',
                blocks: {
                    content: 'content'
                }
            },
            'emrRefreshValues':{
            	xclass: 'iih.mr.wr.omr.action.RefreshValuesAction',
            	url: 'allValue',
                blocks: {
                    content: 'content'
                }
            },
            'mergeAll':{
            	xclass: 'iih.mr.wr.mr.action.MergeAllAction',
//            	url: 'allValue',
                blocks: {
                    content: 'content'
                }
            },
            'closeProgress':{
            	xclass: 'iih.mr.wr.mr.action.CloseProgressAction',
//            	url: 'allValue',
                blocks: {
                    content: 'content'
                }
            },
            'upPro':{
            	xclass: 'iih.mr.wr.mr.action.UpProAction',
//            	url: 'allValue',
                blocks: {
                    content: 'content'
                }
            }*/
            ,'showHyperlink':{
            	xclass: 'iih.mr.action.editor.ShowHyperlinkWindowAction',
            	blocks: {
                     content: 'content'
                }
            },
            'emrHyperlink':{
            	xclass: 'iih.mr.action.editor.EmrHyperlinkAction',
                blocks: {
                    content: 'content'
                }
            }
        },
       
        chains: {
            'init': ['init'],
            'emrExportXML':['emrExportXML'],
            'openMrDoc': ['openMrDoc'],
            'emrRefreshOutpatientDisposal':['emrRefreshOutpatientDisposal'],
//            'upPro': ['upPro'],
            'emrCmdDispatch': ['emrCmdDispatch'],
            'emrSave': ['emrSave'],
            'mergeAllMr': ['mergeAllMr'],
            'closeProgress': ['closeProgress'],
            'doSave': ['emrSave'],
            'emrReadOnly': ['emrReadOnly'],
            'emrEdit': ['emrEdit'],
            'mergeAll': ['mergeAll'],
            'emrDocProperty': ['emrDocProperty'],
            'emrSubmit':['emrSubmit'],
            'emrSignDispose':['emrSignDispose'],
            'emrRevoke':['emrRevoke'],
            'emrStartApprove':['emrStartApprove'],
            'emrApprove':['emrSubmit'],
            'emrReject':['emrReject'],
            'emrAuditRevoke':['emrAuditRevoke'],
            'emrSaveAsTemplate':['emrSaveAsTemplate'],
            'emrRefreshMacro':['emrRefreshMacro'],
            'emrRefreshReference':['emrRefreshMrDocValue'],
            'emrRefreshValues':['emrRefreshValues'],
            'emrRefreshMrDocValue':['emrRefreshMrDocValue'],
            'emrRefreshDiagnosis':['emrRefreshDiagnosis'],
            'disabledOfficeToolBarAction':['disabledOfficeToolBarAction'],
            'editorCallBackAction':['editorCallBackAction'],
            'emrPrint':['emrNeatPrint'],
            'emrContinuePrint':['emrContinuePrint'],
            'getSystemConfig':['getSystemConfig'],
            'emrNeatPrint':['emrNeatPrint'],
            'omrUseSign':['omrUseSign'],
            'showHyperlink':['showHyperlink'],
            'emrPrintSelected':['emrPrintSelected'],
            'emrHyperlink':['emrHyperlink']
        },

        connections: {
            'content': [{
                selector: 'button[method=editorEvent]',
                event: 'editorEvent',
                chain: 'emrCmdDispatch'
            }/*, {
                event: 'afterrender',
                chain: 'init'
            }*/]
        }
    },
    
    initComponent : function() {
        var me = this;
        this.callParent();
        var canvas = Xap.getCanvas();
        this.relayEvents(canvas, ['refreshWorkArea']);
        this.addListener('refreshWorkArea', function(config) {
            var mrSn = config.viewConfig.mrSn;
            var chain = me.getActionChain('openMrDoc');
//            chain.execute({mrSn:mrSn});
        });
    },
    
    hasEdit: function() {
        var plugin = document.getElementById('iemrEditor');
        if (plugin != undefined &&plugin.valid&&plugin.IsModified()) {
            return true;
        } else {
            return false;
        }
    }
})