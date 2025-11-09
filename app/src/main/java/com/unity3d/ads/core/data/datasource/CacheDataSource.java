package com.unity3d.ads.core.data.datasource;

import java.io.File;
import o00O0O0O.OooO0OO;

/* loaded from: classes3.dex */
public interface CacheDataSource {

    public static final class DefaultImpls {
        public static /* synthetic */ Object getFile$default(CacheDataSource cacheDataSource, File file, String str, String str2, Integer num, OooO0OO oooO0OO, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFile");
            }
            if ((i & 4) != 0) {
                str2 = null;
            }
            String str3 = str2;
            if ((i & 8) != 0) {
                num = Integer.MAX_VALUE;
            }
            return cacheDataSource.getFile(file, str, str3, num, oooO0OO);
        }
    }

    Object getFile(File file, String str, String str2, Integer num, OooO0OO oooO0OO);
}
