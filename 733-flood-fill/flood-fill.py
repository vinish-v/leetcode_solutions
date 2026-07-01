class Solution:
    def floodFill(self, image: List[List[int]], sr: int, sc: int, color: int) -> List[List[int]]:
        if image[sr][sc] == color:
            return image
        self.fill(image,sr,sc,image[sr][sc],color)
        return image
    def fill(self,image :List[List[int]],sr :int,sc:int ,curr_colour :int,colour:int)-> List[List[int]]:
        if(sr<0 or sc <0 or  sc>=len(image[0]) or sr>=len(image) or image[sr][sc] != curr_colour ):
            return
        image[sr][sc] = colour;
        self.fill(image,sr+1,sc,curr_colour,colour)
        self.fill(image,sr-1,sc,curr_colour,colour)
        self.fill(image,sr,sc+1,curr_colour,colour)
        self.fill(image,sr,sc-1,curr_colour,colour)



        


        



        