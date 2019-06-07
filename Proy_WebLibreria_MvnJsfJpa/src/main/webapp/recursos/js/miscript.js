$(function(){
		
	$('#formVenta\\:txtFecha').val(miFecha());	
	$("#formVenta\\:txtFecha").attr("disabled", true);
	$("#formVenta\\:textImporte").attr("disabled", true);
	
	$('#formVenta\\:textPrecio').blur(function() {		
		var resultado = parseFloat($('#formVenta\\:textCantidad').val()) *  parseFloat($('#formVenta\\:textPrecio').val());
		$('#formVenta\\:textImporte').val(resultado);		
	});
	
	
	
	
});

function miFecha(){
	
	var d = new Date();
	var mes = d.getMonth()+1;
	if (mes < 10){
		mes = "0" + mes
	}
	
	var strDate = d.getDate() + "/" + mes + "/" + d.getFullYear();
	return strDate;
}