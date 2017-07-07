package com.example.android.booklistingapp;

import android.content.AsyncTaskLoader;
import android.content.Context;
import android.util.Log;

import java.util.List;

/**
 * Created by Lukas on 2017-07-07.
 */

public class BookLoader extends AsyncTaskLoader<List<Book>>  {


        /** Query URL */
        private String mUrl;

        /**
         * Constructs a new {@link BookLoader}.
         *
         * @param context of the activity
         * @param url to load data from
         */
        public BookLoader(Context context, String url) {
            super(context);
            mUrl = url;
        }

        @Override
        protected void onStartLoading() {
            forceLoad();
        }

        /**
         * This is on a background thread.
         */
        @Override
        public List<Book> loadInBackground() {
            if (mUrl == null) {
                return null;
            }

            // Perform the network request, parse the response, and extract a list of earthquakes.
            List<Book> earthquakes = QueryUtils.fetchBookData(mUrl);
            return earthquakes;
        }

    }