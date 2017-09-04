package beyonity.storywriter;

/**
 * Created by mohan on 9/1/17.
 */


import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

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
		View category = inflater.inflate(R.layout.fragment_catagory, container, false);
		View author  = inflater.inflate(R.layout.fragment_author, container, false);
		View myStories = inflater.inflate(R.layout.fragment_mystories, container, false);
		if (Integer.parseInt(content) == 0) {
			setUptrending(trending);
			return trending;
		} else if (Integer.parseInt(content) == 1) {
			setUpCatagories(category);
			return category;
		}else if (Integer.parseInt(content) == 2) {
			return author;
		}


		return myStories;
	}

	private void setUpCatagories(View category) {
		List<catagoryModel> list = new ArrayList<>();
		Catagory_Adapter adapter = new Catagory_Adapter(list);
		RecyclerView rv = (RecyclerView) category.findViewById(R.id.recyclerview);
		RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
		rv.setLayoutManager(mLayoutManager);
		rv.setItemAnimator(new DefaultItemAnimator());
		rv.setAdapter(adapter);

		catagoryModel model1 = new catagoryModel(R.drawable.scifi,"science fiction","1000");
		catagoryModel model2 = new catagoryModel(R.drawable.horror,"Horror","1000");
		catagoryModel model3 = new catagoryModel(R.drawable.epic,"epic","100");
		catagoryModel model4 = new catagoryModel(R.drawable.fiction,"fiction","1000");
		catagoryModel model5 = new catagoryModel(R.drawable.fantasy,"fantasy","1000");
		catagoryModel model6 = new catagoryModel(R.drawable.children,"children","1000");
		catagoryModel model7 = new catagoryModel(R.drawable.humour,"humour","1000");
		catagoryModel model8 = new catagoryModel(R.drawable.thriller,"thriller","1000");
		catagoryModel model9 = new catagoryModel(R.drawable.autobiographies,"Autobiographies","1000");
		catagoryModel model10 = new catagoryModel(R.drawable.poetry,"poetry","1000");
		catagoryModel model11 = new catagoryModel(R.drawable.romance,"Romance","1000");
		catagoryModel model12 = new catagoryModel(R.drawable.mystery,"Mystery","1000");
		catagoryModel model13 = new catagoryModel(R.drawable.travel,"Travel","100");
		catagoryModel model14 = new catagoryModel(R.drawable.journal,"Journals","1000");
		catagoryModel model15 = new catagoryModel(R.drawable.series,"Series","1000");
		catagoryModel model16 = new catagoryModel(R.drawable.history,"History","1000");
		catagoryModel model17 = new catagoryModel(R.drawable.tragic_humour,"tragic humour","1000");
		catagoryModel model18 = new catagoryModel(R.drawable.health,"health","1000");


		list.add(model1);
		list.add(model2);
		list.add(model3);
		list.add(model4);
		list.add(model5);
		list.add(model6);
		list.add(model7);
		list.add(model8);
		list.add(model9);
		list.add(model10);
		list.add(model11);
		list.add(model12);
		list.add(model13);
		list.add(model14);
		list.add(model15);
		list.add(model16);
		list.add(model17);
		list.add(model18);



		adapter.notifyDataSetChanged();

	}

	private void setUptrending(View trending) {
		List<trendingModel> list = new ArrayList<>();
		trending_Adapter adapter = new trending_Adapter(list);
		RecyclerView rv = (RecyclerView) trending.findViewById(R.id.trendview);
		GridLayoutManager layoutManager = new GridLayoutManager(getContext(), 2);  rv.setLayoutManager(layoutManager);
		rv.setLayoutManager(layoutManager);
		rv.setItemAnimator(new DefaultItemAnimator());
		rv.setAdapter(adapter);

		trendingModel model1 = new trendingModel(R.drawable.cover1,"Invincible Ironman");
		trendingModel model2 = new trendingModel(R.drawable.cover2,"Batman");
		trendingModel model3 = new trendingModel(R.drawable.cover3,"Justice League");
		trendingModel model4 = new trendingModel(R.drawable.cover4,"Love");
		trendingModel model5 = new trendingModel(R.drawable.cover5,"Crime Fighter");
		trendingModel model6 = new trendingModel(R.drawable.cover6,"ABC");
		trendingModel model7 = new trendingModel(R.drawable.cover7,"A Joke");
		trendingModel model8 = new trendingModel(R.drawable.cover8,"Thrilling");
		trendingModel model9 = new trendingModel(R.drawable.cover9,"I'm Mandella");
		trendingModel model10 = new trendingModel(R.drawable.cover10,"Poems are Best");


		list.add(model1);
		list.add(model2);
		list.add(model3);
		list.add(model4);
		list.add(model5);
		list.add(model6);
		list.add(model7);
		list.add(model8);
		list.add(model9);
		list.add(model10);


		adapter.notifyDataSetChanged();

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
