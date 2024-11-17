#回溯算法
本质：暴力搜索
模版：
void backtracking(params) {
if (终止条件) {
存放收集结果;
return;
}
for (选择：本层集合中元素（树中节点孩子的数量就是集合的大小）){
处理节点;
backtracking(选择params);//递归
撤销处理结果;//回溯
}
}