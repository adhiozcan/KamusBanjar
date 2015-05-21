package com.kamus.bahasa.banjar.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kamus.bahasa.banjar.R;

public class VocabularyFragment extends Fragment {

	public static VocabularyFragment newInstance() {
		VocabularyFragment mFragment = new VocabularyFragment();
		return mFragment;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View mView = inflater.inflate(R.layout.fragment_vocabulary, container,
				false);
		return mView;
	}

}
