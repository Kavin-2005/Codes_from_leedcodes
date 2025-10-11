# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution(object):
    def inorderTraversal(self, root):
        """
        :type root: Optional[TreeNode]
        :rtype: List[int]
        """
        result = []
        
        def inorder(node):
            if not node:
                return
            inorder(node.left)         # visit left subtree
            result.append(node.val)    # visit root
            inorder(node.right)        # visit right subtree
        
        inorder(root)
        return result
