package pl.sdacademy.materialdesign;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by RENT on 2017-01-26.
 */

public class ThreeTwoImageView extends ImageView {
    public ThreeTwoImageView(Context context) {
        super(context);
    }

    public ThreeTwoImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ThreeTwoImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public ThreeTwoImageView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {

        double height = MeasureSpec.getSize(widthMeasureSpec)*(2.0f/3);
       int heightSpec= MeasureSpec.makeMeasureSpec((int)height,MeasureSpec.EXACTLY);

        super.onMeasure(widthMeasureSpec, heightSpec);
    }
}
