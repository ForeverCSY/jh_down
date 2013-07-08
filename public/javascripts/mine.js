$('#release_btn').click(function() {
	var $image_path = $('#source-img').attr('src');
	//alert($image_path);
	if($image_path == '/public/images/war3.jpg'){
		alert('需要上传封面图片');
		return false;
	}else{
		var $source_img_path = $('#source_img_path');
		$source_img_path.attr('value', $image_path);
		
		return true;
	}
});