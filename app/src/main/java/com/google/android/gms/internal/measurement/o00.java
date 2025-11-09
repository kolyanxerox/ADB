package com.google.android.gms.internal.measurement;

import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Parcel;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class o00 extends o0Oo0oo implements o0000O0O {

    /* renamed from: OooOo0O */
    public final /* synthetic */ o00000oO.OooOOO0 f26469OooOo0O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00(o000O0O0 o000o0o02, o00000oO.OooOOO0 oooOOO0) {
        super("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
        this.f26469OooOo0O = oooOOO0;
        Objects.requireNonNull(o000o0o02);
    }

    @Override // com.google.android.gms.internal.measurement.o0Oo0oo
    public final boolean OooO(int i, Parcel parcel, Parcel parcel2) throws IllegalAccessException, Resources.NotFoundException, PackageManager.NameNotFoundException, ClassNotFoundException, IllegalArgumentException, Oooo.OooOOOO, InvocationTargetException {
        if (i != 2) {
            return false;
        }
        zze();
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.o0000O0O
    public final void zze() throws IllegalAccessException, Resources.NotFoundException, PackageManager.NameNotFoundException, ClassNotFoundException, IllegalArgumentException, Oooo.OooOOOO, InvocationTargetException {
        this.f26469OooOo0O.run();
    }
}
