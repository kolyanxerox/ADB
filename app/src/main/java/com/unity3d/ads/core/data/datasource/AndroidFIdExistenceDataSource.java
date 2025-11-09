package com.unity3d.ads.core.data.datasource;

import kotlin.jvm.internal.OooOo;
import o00O0.o000OOo;
import oo00o.OooOO0O;

/* loaded from: classes3.dex */
public final class AndroidFIdExistenceDataSource implements FIdExistenceDataSource {
    private final String className;

    public AndroidFIdExistenceDataSource(String className) {
        OooOo.OooO0o0(className, "className");
        this.className = className;
    }

    @Override // com.unity3d.ads.core.data.datasource.FIdExistenceDataSource
    public boolean invoke() {
        Object objOooO0O0;
        try {
            objOooO0O0 = Class.forName(this.className);
        } catch (Throwable th) {
            objOooO0O0 = o000OOo.OooO0O0(th);
        }
        return !(objOooO0O0 instanceof OooOO0O);
    }
}
