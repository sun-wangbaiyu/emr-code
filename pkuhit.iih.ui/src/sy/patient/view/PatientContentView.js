Ext.define('iih.sy.patient.view.PatientContentView', {
			extend : 'Xap.ej.stl.view.LeftRightContainerTemplate',
			alias : 'widget.patientcontentview',
			id : 'patientcontentview',
			requires : ['iih.sy.patient.view.PatientLeftListView',
					'iih.sy.patient.block.PatientRightBlock',
					'iih.sy.patient.action.PatientRightDeptDelAction',
					'iih.sy.patient.action.PatientLeftSearchAction',
					'iih.sy.patient.action.PatientRightListAction',
					'iih.sy.patient.action.PatientCreateAction',
					'iih.sy.patient.action.ToReportAction',
					
					'iih.sy.patient.action.CreateOmrDocAction',
					'iih.sy.patient.view.PatientRightView'
					],

			xapConfig : {
				blocks : {
					'left' : {
						xclass : 'iih.sy.patient.view.PatientLeftListView',
						width : 350,
						region:'west',
						split: false,
		                collapsible: true,
		                header:false
					},'right' : {
						xclass : 'iih.sy.patient.view.PatientRightView',
					flex : 1
				   },
				   'content': {
		                xclass: 'iih.mr.block.editor.MrDocEditBlock',
					    region:'east',
				       collapsible: false,
				       split: false
		            }
					
				},

					actions : {
						'init':{
							xclass: 'iih.sy.patient.action.OutMrDocEditAction',
						    url:'omr',
			                blocks: {
			                	content: 'content'
			                }
						},
						'patientRightList': {
							xclass: 'iih.sy.patient.action.PatientRightListAction',
							url: 'omrs2',
							blocks: {
								condition: 'left',
								result: 'right'
							}
						},
						'editPatient': {
			                xclass: 'iih.sy.patient.action.PatientEditWinAction',
			                url:'patient',
			                blocks:{
			                    result:'right'
			                }
			            },
			            'newDoc':{
			            	xclass: 'iih.sy.patient.action.ToReportAction',
							blocks: {
								condition: 'left',
								result: 'right'
							}
			            },
			            'createDoc': {
			                xclass: 'iih.sy.patient.action.CreateOmrDocAction',
			                url:'param',
			                blocks:{
			                    result:'left'
			                }
			            }/*,
			            'delDoc': {
			                xclass: 'iih.sy.patient.action.DelOmrDocAction',
			                url:'patientMr',
			                blocks:{
			                    result:'left'
			                }
			            }*/
					},
					chains : {
						'init':['init'],
						'patientRightList': ['patientRightList'],
						'editPatient' : ['editPatient'],
						'newDoc' : ['newDoc'],
						'createDoc' : ['createDoc']/*,
						'delDoc' : ['delDoc']*/
					},

					connections : {
						'left'	:[{
									selector: 'xapgrid',
									event: 'itemclick',
									chain: 'patientRightList'
								},{
									selector: 'xapgrid',
								event: 'beforeselect',
								chain: 'checkPatientChangeAction'
							}],
						'right' : [{
									event: 'afterrender',
									chain: 'init'
								},/*{
									selector: 'button[action=editPatient]',
									event: 'click',
									chain: 'editPatient'
								},*/{
					                selector: 'button[method=createDoc]',
					                event: 'click',
					                chain: 'createDoc'
					            }/*,{
					                selector: 'button[method=delDoc]',
					                event: 'click',
					                chain: 'delDoc'
					            }*/]
					}
				}
		});