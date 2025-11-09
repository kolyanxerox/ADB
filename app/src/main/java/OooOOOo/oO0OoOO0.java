package OoooOOO;

import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class oO0OoOO0 implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ long f14756OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ String f14757OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ String f14758OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ boolean f14759OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Bundle f14760OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ boolean f14761OooOoOO;

    /* renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ oO0O0OoO f14762OooOoo;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ boolean f14763OooOoo0;

    public oO0OoOO0(oO0O0OoO oo0o0ooo, String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3) {
        this.f14757OooOo0O = str;
        this.f14758OooOo0o = str2;
        this.f14756OooOo = j;
        this.f14760OooOoO0 = bundle;
        this.f14759OooOoO = z;
        this.f14761OooOoOO = z2;
        this.f14763OooOoo0 = z3;
        Objects.requireNonNull(oo0o0ooo);
        this.f14762OooOoo = oo0o0ooo;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.f14762OooOoo.OooOo00(this.f14757OooOo0O, this.f14758OooOo0o, this.f14756OooOo, this.f14760OooOoO0, this.f14759OooOoO, this.f14761OooOoOO, this.f14763OooOoo0);
    }
}
