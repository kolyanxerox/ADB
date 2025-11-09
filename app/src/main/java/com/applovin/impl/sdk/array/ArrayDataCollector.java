package com.applovin.impl.sdk.array;

import com.applovin.array.apphub.aidl.IAppHubService;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;

/* loaded from: classes.dex */
public class ArrayDataCollector {
    private static final String TAG = "ArrayService";
    private final C1240o logger;
    private final C1220k sdk;

    public ArrayDataCollector(C1220k c1220k) {
        this.sdk = c1220k;
        this.logger = c1220k.m2847O();
    }

    public long collectAppHubVersionCode(IAppHubService iAppHubService) {
        try {
            return iAppHubService.getAppHubVersionCode();
        } catch (Throwable th) {
            if (!C1240o.m3200a()) {
                return -1L;
            }
            this.logger.m3212a(TAG, "Failed to collect version code", th);
            return -1L;
        }
    }

    public Boolean collectDirectDownloadEnabled(IAppHubService iAppHubService) {
        try {
            return Boolean.valueOf(iAppHubService.getEnabledFeatures().getBoolean("DIRECT_DOWNLOAD"));
        } catch (Throwable th) {
            if (!C1240o.m3200a()) {
                return null;
            }
            this.logger.m3212a(TAG, "Failed to collect enabled features", th);
            return null;
        }
    }

    public String collectRandomUserToken(IAppHubService iAppHubService) {
        try {
            return iAppHubService.getRandomUserToken();
        } catch (Throwable th) {
            if (!C1240o.m3200a()) {
                return null;
            }
            this.logger.m3212a(TAG, "Failed to collect random user token", th);
            return null;
        }
    }
}
