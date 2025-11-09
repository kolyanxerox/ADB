package com.unity3d.ads.core.data.repository;

import com.unity3d.ads.core.data.model.CachedFile;
import o00O0O0O.OooO0OO;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public interface CacheRepository {

    public static final class DefaultImpls {
        public static /* synthetic */ Object getFile$default(CacheRepository cacheRepository, String str, JSONArray jSONArray, int i, OooO0OO oooO0OO, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFile");
            }
            if ((i2 & 2) != 0) {
                jSONArray = null;
            }
            if ((i2 & 4) != 0) {
                i = 0;
            }
            return cacheRepository.getFile(str, jSONArray, i, oooO0OO);
        }
    }

    Object clearCache(OooO0OO oooO0OO);

    Object doesFileExist(String str, OooO0OO oooO0OO);

    Object getCacheSize(OooO0OO oooO0OO);

    Object getFile(String str, JSONArray jSONArray, int i, OooO0OO oooO0OO);

    Object getWebviewFile(String str, String str2, OooO0OO oooO0OO);

    boolean removeFile(CachedFile cachedFile);

    Object retrieveFile(String str, OooO0OO oooO0OO);
}
