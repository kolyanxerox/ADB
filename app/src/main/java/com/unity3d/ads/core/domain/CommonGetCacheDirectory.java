package com.unity3d.ads.core.domain;

import java.io.File;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes3.dex */
public final class CommonGetCacheDirectory implements GetCacheDirectory {
    @Override // com.unity3d.ads.core.domain.GetCacheDirectory
    public File invoke(File cacheDirectoryBase, String cacheDirectoryPath) {
        OooOo.OooO0o0(cacheDirectoryBase, "cacheDirectoryBase");
        OooOo.OooO0o0(cacheDirectoryPath, "cacheDirectoryPath");
        return new File(cacheDirectoryBase, cacheDirectoryPath);
    }
}
