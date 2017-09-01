package beyonity.storywriter;

/**
 * Created by mohan on 9/1/17.
 */


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;
import beyonity.storywriter.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link viewPageFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link viewPageFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class viewPageFragment extends Fragment {
	// TODO: Rename parameter arguments, choose names that match
	// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
	private static final String ARG_C = "content";
	
	// TODO: Rename and change types of parameters
	private OnFragmentInteractionListener mListener;

	public viewPageFragment() {
		// Required empty public constructor
	}

	public static viewPageFragment newInstance(String content) {
		Bundle args = new Bundle();
		args.putString(ARG_C, content);
		viewPageFragment fragment = new viewPageFragment();
		fragment.setArguments(args);
		return fragment;
	}


	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
	                         Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		String content = getArguments().getString(ARG_C);
		View trending = inflater.inflate(R.layout.fragment_trending,container,false);
		View novels = inflater.inflate(R.layout.fragment_novel, container, false);
		View longStories  = inflater.inflate(R.layout.fragment_longstories, container, false);
		View shortStories = inflater.inflate(R.layout.fragment_shortstories, container, false);
		if (Integer.parseInt(content) == 0) {

			return trending;
		} else if (Integer.parseInt(content) == 1) {
			return novels;
		}else if (Integer.parseInt(content) == 2) {
			return longStories;
		}


		return shortStories;
	}


	// TODO: Rename method, update argument and hook method into UI event
	public void onButtonPressed(Uri uri) {
		if (mListener != null) {
			mListener.onFragmentInteraction(uri);
		}
	}


	@Override
	public void onDetach() {
		super.onDetach();
		mListener = null;
	}

	/**
	 * This interface must be implemented by activities that contain this
	 * fragment to allow an interaction in this fragment to be communicated
	 * to the activity and potentially other fragments contained in that
	 * activity.
	 * <p>
	 * See the Android Training lesson <a href=
	 * "http://developer.android.com/training/basics/fragments/communicating.html"
	 * >Communicating with Other Fragments</a> for more information.
	 */
	public interface OnFragmentInteractionListener {
		// TODO: Update argument type and name
		void onFragmentInteraction(Uri uri);
	}


}
