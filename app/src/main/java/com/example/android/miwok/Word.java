package com.example.android.miwok;


public class Word {

	private String mDefaultTranslation;
	private String mMiwokTranslation;
	private int mImageResourceId = NO_IMAGE_PROVIDED;
	private int mAudioResourceId;

	private static final int NO_IMAGE_PROVIDED = -1;

	public Word(String defaultTranslation, String miwokTranslation) {
		mDefaultTranslation = defaultTranslation;
		mMiwokTranslation = miwokTranslation;
	}

	public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
		mDefaultTranslation = defaultTranslation;
		mMiwokTranslation = miwokTranslation;
		mAudioResourceId = audioResourceId;
	}

	public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId) {
		mDefaultTranslation = defaultTranslation;
		mMiwokTranslation = miwokTranslation;
		mAudioResourceId = audioResourceId;
		mImageResourceId = imageResourceId;
	}

	public String getDefaultTranslation() {
		return mDefaultTranslation;
	}

	public String getMiwokTranslation() {
		return mMiwokTranslation;
	}

	public int getmImageResourceId() {
		return mImageResourceId;
	}

	public int getAudioResourceId() {
		return mAudioResourceId;
	}

	/**
	 *
	 * @return
	 */
	public boolean hasImage() {
		return mImageResourceId != NO_IMAGE_PROVIDED;
	}

}
