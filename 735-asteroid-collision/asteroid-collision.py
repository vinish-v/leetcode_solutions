class Solution:
    def asteroidCollision(self, asteroids: List[int]) -> List[int]:
        stack = []
        for ast in asteroids:
            isalive = True
            while stack and isalive and ast < 0 and stack[-1]> 0:
                if stack[-1] < abs(ast) :
                    stack.pop()
                elif stack[-1] == abs(ast):
                    stack.pop()
                    isalive = False
                else:
                    isalive =False
            if isalive :
                stack.append(ast)
        return stack