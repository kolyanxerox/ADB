package com.google.android.gms.internal.ads;

import com.ironsource.C3034d9;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public abstract class i31 implements Iterator, Closeable, AutoCloseable {

    /* renamed from: OooOoo0 */
    public static final C1661i f19932OooOoo0 = new C1661i("eof ", 1);

    /* renamed from: OooOo0O */
    public AbstractC1440c f19934OooOo0O;

    /* renamed from: OooOo0o */
    public C1428bn f19935OooOo0o;

    /* renamed from: OooOo */
    public InterfaceC1513e f19933OooOo = null;

    /* renamed from: OooOoO0 */
    public long f19937OooOoO0 = 0;

    /* renamed from: OooOoO */
    public long f19936OooOoO = 0;

    /* renamed from: OooOoOO */
    public final ArrayList f19938OooOoOO = new ArrayList();

    static {
        ii0.OooOoOO(i31.class);
    }

    @Override // java.util.Iterator
    /* renamed from: OooO0O0 */
    public final InterfaceC1513e next() {
        InterfaceC1513e interfaceC1513eOooO00o;
        InterfaceC1513e interfaceC1513e = this.f19933OooOo;
        if (interfaceC1513e != null && interfaceC1513e != f19932OooOoo0) {
            this.f19933OooOo = null;
            return interfaceC1513e;
        }
        C1428bn c1428bn = this.f19935OooOo0o;
        if (c1428bn == null || this.f19937OooOoO0 >= this.f19936OooOoO) {
            this.f19933OooOo = f19932OooOoo0;
            throw new NoSuchElementException();
        }
        try {
            synchronized (c1428bn) {
                this.f19935OooOo0o.f17524OooOo0O.position((int) this.f19937OooOoO0);
                interfaceC1513eOooO00o = this.f19934OooOo0O.OooO00o(this.f19935OooOo0o, this);
                this.f19937OooOoO0 = this.f19935OooOo0o.OooO0O0();
            }
            return interfaceC1513eOooO00o;
        } catch (EOFException unused) {
            throw new NoSuchElementException();
        } catch (IOException unused2) {
            throw new NoSuchElementException();
        }
    }

    public void close() {
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        InterfaceC1513e interfaceC1513e = this.f19933OooOo;
        C1661i c1661i = f19932OooOoo0;
        if (interfaceC1513e == c1661i) {
            return false;
        }
        if (interfaceC1513e != null) {
            return true;
        }
        try {
            this.f19933OooOo = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.f19933OooOo = c1661i;
            return false;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(C3034d9.i.f8177d);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f19938OooOoOO;
            if (i >= arrayList.size()) {
                sb.append(C3034d9.i.f8179e);
                return sb.toString();
            }
            if (i > 0) {
                sb.append(";");
            }
            sb.append(((InterfaceC1513e) arrayList.get(i)).toString());
            i++;
        }
    }
}
