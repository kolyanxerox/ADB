package com.unity3d.services.core.network.domain;

import java.io.File;
import kotlin.jvm.internal.OooOo;
import kotlin.jvm.internal.OooOo00;
import o00O0Oo.Oooo000;

/* loaded from: classes3.dex */
public /* synthetic */ class CleanupDirectory$invoke$cachedFiles$1 extends OooOo00 implements Oooo000 {
    public static final CleanupDirectory$invoke$cachedFiles$1 INSTANCE = new CleanupDirectory$invoke$cachedFiles$1();

    public CleanupDirectory$invoke$cachedFiles$1() {
        super(1, File.class, "isFile", "isFile()Z", 0);
    }

    @Override // o00O0Oo.Oooo000
    public final Boolean invoke(File p0) {
        OooOo.OooO0o0(p0, "p0");
        return Boolean.valueOf(p0.isFile());
    }
}
