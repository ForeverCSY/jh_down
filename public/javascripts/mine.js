$('#release_btn').click(function() {
	var $image_path = $('#source-img').attr('src');
	//alert($image_path);
	if($image_path == '/public/images/war3.jpg'){
		alert('需要上传封面图片');
		return false;
	}else{
		var $source_img_path = $('#source_img_path');
		$source_img_path.attr('value', $image_path);
		
		
		var intro = editor.getPlainTxt();
		if(intro.length > 125){
			var brief_intro = intro.substr(0,125); 
		}else{
			var brief_intro = intro;
		}
		
		var $source_brief_intro = $('#source_brief_intro');
		$source_brief_intro.attr('value', brief_intro);
		return true;
	}
});