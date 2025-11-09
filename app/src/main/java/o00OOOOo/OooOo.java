package o00OOOOo;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class OooOo extends o00OOO0O.OooO00o {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ int f32441OooOo;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f32442OooOo0o = 2;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ o00Oo0 f32443OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo(o00Oo0 o00oo0, Object[] objArr, int i, ArrayList arrayList) {
        super("OkHttp %s Push Request[%s]", objArr);
        this.f32443OooOoO0 = o00oo0;
        this.f32441OooOo = i;
    }

    @Override // o00OOO0O.OooO00o
    public final void OooO00o() {
        switch (this.f32442OooOo0o) {
            case 0:
                this.f32443OooOoO0.f32466OooOooo.getClass();
                try {
                    this.f32443OooOoO0.f32477Oooo0oo.OooO0oo(this.f32441OooOo, 6);
                    synchronized (this.f32443OooOoO0) {
                        this.f32443OooOoO0.f32478OoooO00.remove(Integer.valueOf(this.f32441OooOo));
                    }
                    return;
                } catch (IOException unused) {
                    return;
                }
            case 1:
                this.f32443OooOoO0.f32466OooOooo.getClass();
                try {
                    this.f32443OooOoO0.f32477Oooo0oo.OooO0oo(this.f32441OooOo, 6);
                    synchronized (this.f32443OooOoO0) {
                        this.f32443OooOoO0.f32478OoooO00.remove(Integer.valueOf(this.f32441OooOo));
                    }
                    return;
                } catch (IOException unused2) {
                    return;
                }
            default:
                this.f32443OooOoO0.f32466OooOooo.getClass();
                synchronized (this.f32443OooOoO0) {
                    this.f32443OooOoO0.f32478OoooO00.remove(Integer.valueOf(this.f32441OooOo));
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo(o00Oo0 o00oo0, Object[] objArr, int i, ArrayList arrayList, boolean z) {
        super("OkHttp %s Push Headers[%s]", objArr);
        this.f32443OooOoO0 = o00oo0;
        this.f32441OooOo = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo(o00Oo0 o00oo0, Object[] objArr, int i, int i2) {
        super("OkHttp %s Push Reset[%s]", objArr);
        this.f32443OooOoO0 = o00oo0;
        this.f32441OooOo = i;
    }
}
