package com.unity3d.ads.core.domain;

import java.io.File;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes3.dex */
public final class CommonCreateFile implements CreateFile {
    @Override // com.unity3d.ads.core.domain.CreateFile
    public File invoke(File parent, String child) {
        OooOo.OooO0o0(parent, "parent");
        OooOo.OooO0o0(child, "child");
        return new File(parent, child);
    }

    @Override // com.unity3d.ads.core.domain.CreateFile
    public File invoke(String pathname) {
        OooOo.OooO0o0(pathname, "pathname");
        return new File(pathname);
    }
}
