package io.codeforall.bootcamp.gfx.simplegfx;

import io.codeforall.bootcamp.gfx.lanterna.LanternaGrid;
import io.codeforall.bootcamp.grid.GridDirection;
import io.codeforall.bootcamp.grid.position.AbstractGridPosition;
import io.codeforall.bootcamp.grid.position.GridPosition;
import io.codeforall.bootcamp.grid.GridColor;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

/**
 * Simple graphics position
 */
public class SimpleGfxGridPosition extends AbstractGridPosition {

    private Rectangle rectangle;
    private SimpleGfxGrid simpleGfxGrid;

    /**
     * Simple graphics position constructor
     *
     * @param grid Simple graphics grid
     */
    public SimpleGfxGridPosition(SimpleGfxGrid grid) {
        super((int) (Math.random() * grid.getCols()), (int) (Math.random() * grid.getRows()), grid);
        //rectangle = new Rectangle((Math.random() * simpleGfxGrid.getCols()),(Math.random() * simpleGfxGrid.getRows()),simpleGfxGrid.getCellSize(),simpleGfxGrid.getCellSize());
        //rectangle.draw();
        //rectangle.fill();


    }

    /**
     * Simple graphics position constructor
     *
     * @param col  position column
     * @param row  position row
     * @param grid Simple graphics grid
     */
    public SimpleGfxGridPosition(int col, int row, SimpleGfxGrid grid) {
        super(col, row, grid);
        this.simpleGfxGrid = grid;
        rectangle = new Rectangle(grid.getX(), grid.getY(), grid.getCellSize(), grid.getCellSize());
        setColor(GridColor.BLUE);
        show();

    }


    /**
     * @see GridPosition#show()
     */
    @Override
    public void show() {
        this.rectangle.fill();

    }

    /**
     * @see GridPosition#hide()
     */
    @Override
    public void hide() {
        this.rectangle.delete();
    }

    /**
     * @see GridPosition#moveInDirection(GridDirection, int)
     */
    @Override
    public void moveInDirection(GridDirection direction, int distance) {

    }

    /**
     * @see AbstractGridPosition#setColor(GridColor)
     */
    @Override
    public void setColor(GridColor color) {
        super.setColor(color);
        this.rectangle.setColor(SimpleGfxColorMapper.getColor(color));

    }


}
