package o000Oo0O;

import android.text.TextUtils;
import java.io.IOException;
import java.util.Iterator;
import o000Oo0o.o0ooOOo;

/* loaded from: classes2.dex */
public final /* synthetic */ class OooOo implements Runnable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f30368OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Oooo000 f30369OooOo0o;

    public /* synthetic */ OooOo(Oooo000 oooo000, int i) {
        this.f30368OooOo0O = i;
        this.f30369OooOo0o = oooo000;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        o0ooOOo o0oooooOooOO0o;
        o0ooOOo o0oooooOooO0oo;
        switch (this.f30368OooOo0O) {
            case 0:
                this.f30369OooOo0o.OooO00o();
                return;
            case 1:
                this.f30369OooOo0o.OooO00o();
                return;
            default:
                Oooo000 oooo000 = this.f30369OooOo0o;
                oooo000.getClass();
                Object obj = Oooo000.f30373OooOOO0;
                synchronized (obj) {
                    try {
                        o0000o0.Oooo0 oooo0 = oooo000.f30375OooO00o;
                        oooo0.OooO00o();
                        OooOo00 oooOo00OooO00o = OooOo00.OooO00o(oooo0.f29588OooO00o);
                        try {
                            o0oooooOooOO0o = oooo000.f30377OooO0OO.OooOO0o();
                            if (oooOo00OooO00o != null) {
                                oooOo00OooO00o.OooOOO0();
                            }
                        } catch (Throwable th) {
                            if (oooOo00OooO00o != null) {
                                oooOo00OooO00o.OooOOO0();
                            }
                            throw th;
                        }
                    } finally {
                    }
                }
                try {
                    int i = o0oooooOooOO0o.f30407OooO0O0;
                    if (i == 5) {
                        o0oooooOooO0oo = oooo000.OooO0oo(o0oooooOooOO0o);
                    } else {
                        if (i == 3) {
                            o0oooooOooO0oo = oooo000.OooO0oo(o0oooooOooOO0o);
                        } else if (!oooo000.f30378OooO0Oo.OooO00o(o0oooooOooOO0o)) {
                            return;
                        } else {
                            o0oooooOooO0oo = oooo000.OooO0O0(o0oooooOooOO0o);
                        }
                    }
                    synchronized (obj) {
                        try {
                            o0000o0.Oooo0 oooo02 = oooo000.f30375OooO00o;
                            oooo02.OooO00o();
                            OooOo00 oooOo00OooO00o2 = OooOo00.OooO00o(oooo02.f29588OooO00o);
                            try {
                                oooo000.f30377OooO0OO.OooOO0(o0oooooOooO0oo);
                                if (oooOo00OooO00o2 != null) {
                                    oooOo00OooO00o2.OooOOO0();
                                }
                            } catch (Throwable th2) {
                                if (oooOo00OooO00o2 != null) {
                                    oooOo00OooO00o2.OooOOO0();
                                }
                                throw th2;
                            }
                        } finally {
                        }
                    }
                    synchronized (oooo000) {
                        try {
                            if (oooo000.f30384OooOO0O.size() != 0 && !TextUtils.equals(o0oooooOooOO0o.f30406OooO00o, o0oooooOooO0oo.f30406OooO00o)) {
                                Iterator it = oooo000.f30384OooOO0O.iterator();
                                if (it.hasNext()) {
                                    if (it.next() != null) {
                                        throw new ClassCastException();
                                    }
                                    throw null;
                                }
                            }
                        } finally {
                        }
                    }
                    if (o0oooooOooO0oo.f30407OooO0O0 == 4) {
                        String str = o0oooooOooO0oo.f30406OooO00o;
                        synchronized (oooo000) {
                            oooo000.f30383OooOO0 = str;
                        }
                    }
                    int i2 = o0oooooOooO0oo.f30407OooO0O0;
                    if (i2 == 5) {
                        oooo000.OooO(new o000oOoO());
                        return;
                    } else if (i2 == 2 || i2 == 1) {
                        oooo000.OooO(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                        return;
                    } else {
                        oooo000.OooOO0(o0oooooOooO0oo);
                        return;
                    }
                } catch (o000oOoO e) {
                    oooo000.OooO(e);
                    return;
                }
        }
    }
}
