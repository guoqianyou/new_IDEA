/**
 * Created by GQY on 2015/9/28.
 */
//js获取项目根路径，如： http://localhost:8083/uimcardprj
var getRootPath=function(){
    //获取当前网址，如： http://localhost:8083/uimcardprj/share/meun.jsp
    var curWwwPath=window.document.location.href;
    //获取主机地址之后的目录，如： uimcardprj/share/meun.jsp
    var pathName=window.document.location.pathname;
    var pos=curWwwPath.indexOf(pathName);
    //获取主机地址，如： http://localhost:8083
    var localhostPaht=curWwwPath.substring(0,pos);
    //获取带"/"的项目名，如：/uimcardprj
    var projectName=pathName.substring(0,pathName.substr(1).indexOf('/')+1);
    return(localhostPaht+projectName);
};
var pagepath = {
    newsType: "news/newsType.jsp"
};
var pageCssJs= {
    newsType: [
        getRootPath()+"/plugins/dataTable/css/dataTables.bootstrap.min.css",
        getRootPath()+"/plugins/dataTable/js/jquery.dataTables.min.js",
        getRootPath()+"/plugins/dataTable/js/dataTables.bootstrap.min.js"
    ]
};
var pageload = function (Path,cssJs) {
    $("#center").load(Path);
    if(null!=cssJs){
        $.loadFile(cssJs);
    }
};
