$(function(){
		
//	$('#formVenta\\:txtFecha').val(miFecha());	
//	$("#formVenta\\:txtFecha").attr("disabled", true);
//	$("#formVenta\\:textImporte").attr("disabled", true);
//	
//	$('#formVenta\\:textCantidad').blur(function() {		
//		var resultado = parseFloat($('#formVenta\\:textCantidad').val()) *  parseFloat($('#formVenta\\:textPrecio').val());
//		$('#formVenta\\:textImporte').val(resultado);		
//	});
	
	$('#formVenta\\:cboLibros').on('change', function() {		  
		  $('#formVenta\\:textCantidad').focus();
	});
	
	
	
});

