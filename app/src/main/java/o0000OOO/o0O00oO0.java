package o0000ooO;

import o000Ooo0.OooOO0;

/* loaded from: classes2.dex */
public final /* synthetic */ class o0O00oO0 implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Runnable f29707OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f29708OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ o0oO0O0o f29709OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ OooOO0 f29710OooOoO0;

    public /* synthetic */ o0O00oO0(o0oO0O0o o0oo0o0o, Runnable runnable, OooOO0 oooOO0, int i) {
        this.f29708OooOo0O = i;
        this.f29709OooOo0o = o0oo0o0o;
        this.f29707OooOo = runnable;
        this.f29710OooOoO0 = oooOO0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f29708OooOo0O) {
            case 0:
                o0oO0O0o o0oo0o0o = this.f29709OooOo0o;
                final OooOO0 oooOO0 = this.f29710OooOoO0;
                final Runnable runnable = this.f29707OooOo;
                final int i = 0;
                o0oo0o0o.f29726OooOo0O.execute(new Runnable() { // from class: o0000ooO.o0oO0Ooo
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e) {
                                    ((o0O0O0Oo) oooOO0.f30538OooOo0o).setException(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e2) {
                                    ((o0O0O0Oo) oooOO0.f30538OooOo0o).setException(e2);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                o0O0O0Oo o0o0o0oo = (o0O0O0Oo) oooOO0.f30538OooOo0o;
                                try {
                                    runnable2.run();
                                    o0o0o0oo.set(null);
                                    return;
                                } catch (Exception e3) {
                                    o0o0o0oo.setException(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                o0oO0O0o o0oo0o0o2 = this.f29709OooOo0o;
                final OooOO0 oooOO02 = this.f29710OooOoO0;
                final Runnable runnable2 = this.f29707OooOo;
                final int i2 = 2;
                o0oo0o0o2.f29726OooOo0O.execute(new Runnable() { // from class: o0000ooO.o0oO0Ooo
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i2) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ((o0O0O0Oo) oooOO02.f30538OooOo0o).setException(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    ((o0O0O0Oo) oooOO02.f30538OooOo0o).setException(e2);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                o0O0O0Oo o0o0o0oo = (o0O0O0Oo) oooOO02.f30538OooOo0o;
                                try {
                                    runnable22.run();
                                    o0o0o0oo.set(null);
                                    return;
                                } catch (Exception e3) {
                                    o0o0o0oo.setException(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                o0oO0O0o o0oo0o0o3 = this.f29709OooOo0o;
                final OooOO0 oooOO03 = this.f29710OooOoO0;
                final Runnable runnable3 = this.f29707OooOo;
                final int i3 = 1;
                o0oo0o0o3.f29726OooOo0O.execute(new Runnable() { // from class: o0000ooO.o0oO0Ooo
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i3) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e) {
                                    ((o0O0O0Oo) oooOO03.f30538OooOo0o).setException(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e2) {
                                    ((o0O0O0Oo) oooOO03.f30538OooOo0o).setException(e2);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                o0O0O0Oo o0o0o0oo = (o0O0O0Oo) oooOO03.f30538OooOo0o;
                                try {
                                    runnable22.run();
                                    o0o0o0oo.set(null);
                                    return;
                                } catch (Exception e3) {
                                    o0o0o0oo.setException(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
        }
    }
}
