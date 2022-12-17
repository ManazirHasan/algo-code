Tree question

Binary tree and generic tree

level of nodes - 
    distance from root (no. of edges or no. of nodes )

leaf node - no children-
root (level =0, or 1 )

deepest node - last level of node

height= distance between deepest node 

height of node = level(deepest node ) - level of (node)

cousins - same level not immidiate parents
sibling - both have same parents

size of node - number of children + self node

size of tree - total number of nodes

Strict binary tree(SBT) - 0 or 2 children

(Perfect)full BT- all leaf node should be at same level l 

complete BT = SBT + All leaf nodes on level l or l-1 level

Traversal order:
1) In, Pre, Post- Horiz, Vert, Level order, boundry, 
2) find height, level from root 
3) left view, right view, top, bottom,find Diameter
4) swap or mirror image 
5) max heap and min heap



Question set
1) Find height of btree(root node)
2) Both tree are indentical( structure should be same) or node(left ==left and right ==right)-
3) Two tree are Isomorphic(mirror image) or not ? -- left should be right and right should be left
    convert mirror tree 
4) Light source on left then find Left view of tree 
5) Check if two nodes are sibling or not ?
6) Binary tree Zigzag traversal - leetcode
**********************************************************
1) In full BT(Special tree, left,right,next(point to for same level )):
    point next node is appropritate , initial next is null
2) if above is not full BT then how to handle

3) Horizontal distance of each node in FBT - print nodes of horizontal view nodes 
4) Top view of node print/Bottom view

5) Vertical order or sum problem before that
6) linklist of linklist 
find all leafs of binary tree
7) Boundary traversal of BT
8) last question of tree videos 3
**********************************************************
LL (delete nodes all  given integer value from list)



/*
 *                                           20
 *
 *                              11                       32
 *
 *                       9              15           30          35
 *
 *
 * inorder    9,11,15,20,30,32,35
 * preorder   20,11,9,15,32,30,35  //top down data flow
 * postorder  9,15,11,30,35,32,20   //bottom up data flow
 * 
*/