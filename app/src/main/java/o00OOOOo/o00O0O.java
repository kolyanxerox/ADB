package o00OOOOo;

import java.io.IOException;
import oOooo0o.o00OOOOo;

/* loaded from: classes3.dex */
public final class o00O0O extends o00OOO0O.OooO00o {

    /* renamed from: OooOo */
    public final /* synthetic */ Object f32453OooOo;

    /* renamed from: OooOo0o */
    public final /* synthetic */ int f32454OooOo0o = 1;

    /* renamed from: OooOoO0 */
    public final Object f32455OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O(o00Oo0 o00oo0, oo000o oo000oVar) {
        super("OkHttp %s", o00oo0.f32461OooOoO0);
        this.f32453OooOo = o00oo0;
        this.f32455OooOoO0 = oo000oVar;
    }

    @Override // o00OOO0O.OooO00o
    public final void OooO00o() throws IOException {
        int i;
        o0Oo0oo[] o0oo0ooArr;
        long j;
        switch (this.f32454OooOo0o) {
            case 0:
                o0Oo0oo o0oo0oo = (o0Oo0oo) this.f32455OooOoO0;
                o00O0O o00o0o = (o00O0O) this.f32453OooOo;
                try {
                    ((o00Oo0) o00o0o.f32453OooOo).f32459OooOo0o.OooO0O0(o0oo0oo);
                    return;
                } catch (IOException e) {
                    o00OOOOo.f33168OooO00o.OooOO0o(4, "Http2Connection.Listener failure for " + ((o00Oo0) o00o0o.f32453OooOo).f32461OooOoO0, e);
                    try {
                        o0oo0oo.OooO0OO(2);
                        return;
                    } catch (IOException unused) {
                        return;
                    }
                }
            case 1:
                o00O0O o00o0o2 = (o00O0O) this.f32453OooOo;
                OooO0oO.Oooo0 oooo0 = (OooO0oO.Oooo0) this.f32455OooOoO0;
                synchronized (((o00Oo0) o00o0o2.f32453OooOo).f32477Oooo0oo) {
                    synchronized (((o00Oo0) o00o0o2.f32453OooOo)) {
                        try {
                            int iOooO0o0 = ((o00Oo0) o00o0o2.f32453OooOo).f32474Oooo0o.OooO0o0();
                            OooO0oO.Oooo0 oooo02 = ((o00Oo0) o00o0o2.f32453OooOo).f32474Oooo0o;
                            oooo02.getClass();
                            for (int i2 = 0; i2 < 10; i2++) {
                                boolean z = true;
                                if (((1 << i2) & oooo0.f13285OooOo0o) == 0) {
                                    z = false;
                                }
                                if (z) {
                                    oooo02.OooO0oO(i2, ((int[]) oooo0.f13283OooOo)[i2]);
                                }
                            }
                            int iOooO0o02 = ((o00Oo0) o00o0o2.f32453OooOo).f32474Oooo0o.OooO0o0();
                            o0oo0ooArr = null;
                            if (iOooO0o02 == -1 || iOooO0o02 == iOooO0o0) {
                                j = 0;
                            } else {
                                j = iOooO0o02 - iOooO0o0;
                                if (!((o00Oo0) o00o0o2.f32453OooOo).f32457OooOo.isEmpty()) {
                                    o0oo0ooArr = (o0Oo0oo[]) ((o00Oo0) o00o0o2.f32453OooOo).f32457OooOo.values().toArray(new o0Oo0oo[((o00Oo0) o00o0o2.f32453OooOo).f32457OooOo.size()]);
                                }
                            }
                        } finally {
                        }
                    }
                    try {
                        o00Oo0 o00oo0 = (o00Oo0) o00o0o2.f32453OooOo;
                        o00oo0.f32477Oooo0oo.OooO00o(o00oo0.f32474Oooo0o);
                    } catch (IOException unused2) {
                        ((o00Oo0) o00o0o2.f32453OooOo).OooO0O0();
                    }
                }
                if (o0oo0ooArr != null) {
                    for (o0Oo0oo o0oo0oo2 : o0oo0ooArr) {
                        synchronized (o0oo0oo2) {
                            o0oo0oo2.f32503OooO0O0 += j;
                            if (j > 0) {
                                o0oo0oo2.notifyAll();
                            }
                        }
                    }
                }
                o00Oo0.f32456OoooO0.execute(new OooOo00(o00o0o2, new Object[]{((o00Oo0) o00o0o2.f32453OooOo).f32461OooOoO0}));
                return;
            default:
                o00Oo0 o00oo02 = (o00Oo0) this.f32453OooOo;
                oo000o oo000oVar = (oo000o) this.f32455OooOoO0;
                try {
                    try {
                        oo000oVar.OooO0OO(this);
                        do {
                        } while (oo000oVar.OooO0O0(false, this));
                        o00oo02.OooO00o(1, 6);
                    } catch (IOException unused3) {
                        o00oo02.OooO00o(2, 2);
                    } catch (Throwable th) {
                        try {
                            o00oo02.OooO00o(3, 3);
                        } catch (IOException unused4) {
                        }
                        o00OOO0O.OooO0OO.OooO0o0(oo000oVar);
                        throw th;
                    }
                } catch (IOException unused5) {
                }
                o00OOO0O.OooO0OO.OooO0o0(oo000oVar);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O(o00O0O o00o0o, Object[] objArr, o0Oo0oo o0oo0oo) {
        super("OkHttp %s stream %d", objArr);
        this.f32453OooOo = o00o0o;
        this.f32455OooOoO0 = o0oo0oo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O(o00O0O o00o0o, Object[] objArr, OooO0oO.Oooo0 oooo0) {
        super("OkHttp %s ACK Settings", objArr);
        this.f32453OooOo = o00o0o;
        this.f32455OooOoO0 = oooo0;
    }
}
