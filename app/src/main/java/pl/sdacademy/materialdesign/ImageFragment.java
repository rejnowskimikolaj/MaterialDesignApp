package pl.sdacademy.materialdesign;


import android.animation.Animator;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class ImageFragment extends Fragment {

    CardView cardView;
    Button button;

    public ImageFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_image, container, false);

        cardView = (CardView) view.findViewById(R.id.fragment_image_cardView);
        cardView.setVisibility(View.INVISIBLE);

        button = (Button) view.findViewById(R.id.fragment_image_button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animator anim = ViewAnimationUtils.
                                createCircularReveal(cardView,cardView.getWidth()/2,cardView.getHeight(),
                                      0 , (float)Math.hypot(cardView.getHeight(),cardView.getWidth()));
                if(cardView.getVisibility()==View.INVISIBLE){
                    cardView.setVisibility(View.VISIBLE);
                    anim.start();
                }
                else {
                    cardView.setVisibility(View.INVISIBLE);
                     anim = ViewAnimationUtils.
                            createCircularReveal(cardView,cardView.getWidth()/2,cardView.getHeight(),
                                     (float)Math.hypot(cardView.getHeight(),cardView.getWidth()),0);

                }
            }
        });
        return view;
    }

}
