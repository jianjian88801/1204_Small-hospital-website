const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootil5n0/",
            name: "springbootil5n0",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbootil5n0/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "中小型医院网站"
        } 
    }
}
export default base
