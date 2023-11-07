class Solution:
    def largestValues(self, root):
        # Initialize a dictionary to store the largest value at each level
        level_max = {}
        # Perform depth-first search (DFS) to find the largest values
        self.dfs(root, 0, level_max)
        # Convert the values from the dictionary to a list and return it
        return list(level_max.values())

    def dfs(self, root, level, level_max):
        if root is None:
            return
        # Update the largest value for the current level in the dictionary
        level_max[level] = max(root.val, level_max.get(level, float('-inf')))
        # Recursively traverse the left and right subtrees
        self.dfs(root.left, level + 1, level_max)
        self.dfs(root.right, level + 1, level_max)