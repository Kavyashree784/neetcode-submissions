# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def diameterOfBinaryTree(self, root: Optional[TreeNode]) -> int:
        self.diameter =0

        def calculate_depth(node):
            if node is None: return 0

            left_depth = calculate_depth(node.left)
            right_depth = calculate_depth(node.right)

            self.diameter = max(self.diameter, left_depth + right_depth)

            return max(left_depth,right_depth)+1
        
        calculate_depth(root)
        return self.diameter
