package com.necisstudio.cast;

import android.content.Context;

import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.OptionsProvider;
import com.google.android.gms.cast.framework.SessionProvider;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vim on 26/10/16.
 */

class CastOptionProvider implements OptionsProvider {
    public static final String CUSTOM_NAMESPACE = "urn:x-cast:custom_namespace";
    @Override
    public CastOptions getCastOptions(Context appContext) {
        List<String> supportedNamespaces = new ArrayList<>();
        supportedNamespaces.add(CUSTOM_NAMESPACE);
        CastOptions castOptions = new CastOptions.Builder()
                .setReceiverApplicationId(appContext.getString(R.string.app_name))
                .setSupportedNamespaces(supportedNamespaces)
                .build();
        return castOptions;
    }
    @Override
    public List<SessionProvider> getAdditionalSessionProviders(Context context) {
        return null;
    }
}