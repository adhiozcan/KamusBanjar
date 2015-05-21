package com.kamus.bahasa.banjar;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.kamus.bahasa.banjar.adapter.ViewPagerAdapter;
import com.kamus.bahasa.banjar.lib.SlidingTabLayout;

public class MainActivity extends AppCompatActivity {
	private SlidingTabLayout mSlidingTab;
	private ViewPager mViewPager;
	private FragmentManager mFragment;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		setSlidingTab();
	}

	private void setSlidingTab() {
		mViewPager = (ViewPager) findViewById(R.id.view_pager);
		mFragment = getSupportFragmentManager();
		mViewPager.setAdapter(new ViewPagerAdapter(this, mFragment));

		mSlidingTab = (SlidingTabLayout) findViewById(R.id.sliding_tab);
		mSlidingTab.setCustomTabView(R.layout.custom_sliding_tab, 0);
		mSlidingTab.setDistributeEvenly(true);
		//mSlidingTab.setViewPager(mViewPager);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
