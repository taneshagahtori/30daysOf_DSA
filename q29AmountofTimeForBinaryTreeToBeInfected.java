class Solution {
    public int amountOfTime(TreeNode root, int start) {
        MapInteger, SetInteger map=new HashMap();
        convertTreeToGraph(root,0,map);
        QueueInteger queue= new LinkedList();
        queue.add(start);
        SetInteger visited=new HashSet();
        visited.add(start);
        int minutes=0;
        while(!queue.isEmpty()){
            int levelSize=queue.size();
            while (levelSize0){
                int current=queue.poll();
                for(int nummap.get(current)){
                    if(!visited.contains(num)){
                        queue.add(num);
                        visited.add(num);
                    }
                }
                levelSize--;
            }
            minutes++;
        }
        return minutes - 1;
    }
    private void convertTreeToGraph(TreeNode current, int parent, MapInteger, SetInteger map){
        if (current!=null){
            if(!map.containsKey(current.val)){
                map.put(current.val, new HashSet());
            }
            SetInteger adjacentList= map.get(current.val);
            if(parent!=0){
                adjacentList.add(parent);
            }
            if(current.left!=null){
                adjacentList.add(current.left.val);
            }
            if(current.right!=null){
                adjacentList.add(current.right.val);
            }
            convertTreeToGraph(current.left, current.val, map);
            convertTreeToGraph(current.right, current.val, map);
        }
    }
}