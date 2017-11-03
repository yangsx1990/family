<html>
<head>
    <title>freemarker测试</title>
    <script type="text/javascript">
        function getFileUrl(sourceId) {
            var url;
            if (navigator.userAgent.indexOf("MSIE")>=1) { // IE
                url = document.getElementById(sourceId).value;
            } else if(navigator.userAgent.indexOf("Firefox")>0) { // Firefox
                url = window.URL.createObjectURL(document.getElementById(sourceId).files.item(0));
            } else if(navigator.userAgent.indexOf("Chrome")>0) { // Chrome
                url = window.URL.createObjectURL(document.getElementById(sourceId).files.item(0));
            }
            return url;
        }
        function preImg(sourceId, targetId) {
            var url = getFileUrl(sourceId);
            var imgPre = document.getElementById(targetId);
            imgPre.src = url;
        }
    </script>
</head>
<body>
<h1>${title}：</h1>
<form action="/upload" method="post" enctype="multipart/form-data">
    <input type="file" name="test" id="imgOne" onchange="preImg(this.id,'photo');"/>
    <input type="submit" name="确定"/>
    <br/>
    <img id="photo" src="" width="300px" height="300px" style="display: block;" />
</form>
</body>
</html>