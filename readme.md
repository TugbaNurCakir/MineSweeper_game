
# MineSweeper Game
### Java101 Graduation Project

## Game Rules:

- This game is based text.
- Must be played in multidimensional arrays and designed in MineSweeper Class
- User must define dimension of row and column so dimension of matris.
- A quarter of the number of elements in the array must be mined in the array.
- Must be another array holding the position of the mines
- User must select a position and for this user must enter row and column .
- It should be checked whether the selected point is within the boundaries of the array and if the condition is not met, the point should be requested again.
- If there is a mine at the point where the user enters, user must lose the game.
- If there are no mines, all positions that touch the relevant point should be looked at (right, left, up, down, upper left diagonal, upper right diagonal, lower right diagonal, lower left diagonal) and the sum of the number of mines around should be written on the relevant point. If there is no mine touching the point, the value "0" should be assigned.

-If the user can select all the points without pressing any mines, user must win the game.



