package com.kamus.bahasa.banjar.adapter;

import android.app.Activity;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.content.res.ResourcesCompat;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ImageSpan;

import com.kamus.bahasa.banjar.R;
import com.kamus.bahasa.banjar.fragment.SearchFragment;
import com.kamus.bahasa.banjar.fragment.SettingFragment;
import com.kamus.bahasa.banjar.fragment.VocabularyFragment;

public class ViewPagerAdapter extends FragmentPagerAdapter {

	Activity mActivity;
	TypedArray fragment_icon;
	String fragment_title[];

	public ViewPagerAdapter(Activity mActivity, FragmentManager fm) {
		super(fm);
		this.mActivity = mActivity;

		fragment_icon = mActivity.getResources().obtainTypedArray(
				R.array.sliding_tab_icon);

	}

	@Override
	public CharSequence getPageTitle(int position) {
		Drawable image = ResourcesCompat.getDrawable(mActivity.getResources(),
				fragment_icon.getResourceId(position, -1), null);
		image.setBounds(0, 0, image.getIntrinsicWidth(),
				image.getIntrinsicHeight());
		SpannableString sb = new SpannableString(" ");
		ImageSpan imageSpan = new ImageSpan(image, ImageSpan.ALIGN_BOTTOM);
		sb.setSpan(imageSpan, 0, 1, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

		fragment_icon.recycle();
		return sb;
	}

	@Override
	public Fragment getItem(int position) {
		switch (position) {
		case 0:
			return SearchFragment.newInstance();
		case 1:
			return VocabularyFragment.newInstance();
		case 2:
			return SettingFragment.newInstance();
		}

		return null;
	}

	@Override
	public int getCount() {
		return 3;
	}

}
