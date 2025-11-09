package o00O0Oo0;

import OooOOO0.OooO00o;
import java.io.File;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;
import o00O0OoO.OooO0OO;

/* loaded from: classes3.dex */
public final class o0OoOo0 implements Iterator, OooO0OO {

    /* renamed from: OooOo, reason: collision with root package name */
    public Object f31399OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f31400OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public int f31401OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ o00O0o.Oooo000 f31402OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public Object f31403OooOoO0;

    public o0OoOo0(o00Oo0 o00oo0) {
        this.f31400OooOo0O = 0;
        this.f31402OooOoO = o00oo0;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f31403OooOoO0 = arrayDeque;
        if (((File) o00oo0.f31392OooO0O0).isDirectory()) {
            arrayDeque.push(OooO0OO((File) o00oo0.f31392OooO0O0));
        } else {
            if (!((File) o00oo0.f31392OooO0O0).isFile()) {
                this.f31401OooOo0o = 2;
                return;
            }
            File rootFile = (File) o00oo0.f31392OooO0O0;
            kotlin.jvm.internal.OooOo.OooO0o0(rootFile, "rootFile");
            arrayDeque.push(new Oooo0(rootFile));
        }
    }

    public void OooO00o() {
        Object next;
        o00O0o.OooOo00 oooOo00;
        do {
            Iterator it = (Iterator) this.f31399OooOo;
            if (!it.hasNext()) {
                this.f31401OooOo0o = 0;
                return;
            } else {
                next = it.next();
                oooOo00 = (o00O0o.OooOo00) this.f31402OooOoO;
            }
        } while (((Boolean) oooOo00.f31418OooO0OO.invoke(next)).booleanValue() != oooOo00.f31417OooO0O0);
        this.f31403OooOoO0 = next;
        this.f31401OooOo0o = 1;
    }

    public void OooO0O0() {
        Iterator it = (Iterator) this.f31399OooOo;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) ((o00O0Oo.Oooo000) ((o00Oo0) this.f31402OooOoO).f31393OooO0OO).invoke(next)).booleanValue()) {
                this.f31401OooOo0o = 1;
                this.f31403OooOoO0 = next;
                return;
            }
        }
        this.f31401OooOo0o = 0;
    }

    public OooOo OooO0OO(File file) {
        int iOrdinal = ((o00Ooo) ((o00Oo0) this.f31402OooOoO).f31393OooO0OO).ordinal();
        if (iOrdinal == 0) {
            return new o000oOoO(this, file);
        }
        if (iOrdinal == 1) {
            return new Oooo000(this, file);
        }
        throw new OooO00o();
    }

    public boolean OooO0Oo() {
        File file;
        File fileOooO00o;
        this.f31401OooOo0o = 3;
        while (true) {
            ArrayDeque arrayDeque = (ArrayDeque) this.f31403OooOoO0;
            o00O0O o00o0o = (o00O0O) arrayDeque.peek();
            if (o00o0o == null) {
                file = null;
                break;
            }
            fileOooO00o = o00o0o.OooO00o();
            if (fileOooO00o == null) {
                arrayDeque.pop();
            } else {
                if (fileOooO00o.equals(o00o0o.f31390OooO00o) || !fileOooO00o.isDirectory()) {
                    break;
                }
                int size = arrayDeque.size();
                ((o00Oo0) this.f31402OooOoO).getClass();
                if (size >= Integer.MAX_VALUE) {
                    break;
                }
                arrayDeque.push(OooO0OO(fileOooO00o));
            }
        }
        file = fileOooO00o;
        if (file != null) {
            this.f31399OooOo = file;
            this.f31401OooOo0o = 1;
        } else {
            this.f31401OooOo0o = 2;
        }
        return this.f31401OooOo0o == 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f31400OooOo0O) {
            case 0:
                int i = this.f31401OooOo0o;
                if (i == 0) {
                    return OooO0Oo();
                }
                if (i == 1) {
                    return true;
                }
                if (i == 2) {
                    return false;
                }
                throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
            case 1:
                if (this.f31401OooOo0o == -1) {
                    OooO00o();
                }
                return this.f31401OooOo0o == 1;
            default:
                if (this.f31401OooOo0o == -1) {
                    OooO0O0();
                }
                return this.f31401OooOo0o == 1;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f31400OooOo0O) {
            case 0:
                int i = this.f31401OooOo0o;
                if (i == 1) {
                    this.f31401OooOo0o = 0;
                    return (File) this.f31399OooOo;
                }
                if (i == 2 || !OooO0Oo()) {
                    throw new NoSuchElementException();
                }
                this.f31401OooOo0o = 0;
                return (File) this.f31399OooOo;
            case 1:
                if (this.f31401OooOo0o == -1) {
                    OooO00o();
                }
                if (this.f31401OooOo0o == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f31403OooOoO0;
                this.f31403OooOoO0 = null;
                this.f31401OooOo0o = -1;
                return obj;
            default:
                if (this.f31401OooOo0o == -1) {
                    OooO0O0();
                }
                if (this.f31401OooOo0o == 0) {
                    throw new NoSuchElementException();
                }
                Object obj2 = this.f31403OooOoO0;
                this.f31403OooOoO0 = null;
                this.f31401OooOo0o = -1;
                return obj2;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f31400OooOo0O) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public o0OoOo0(o00O0o.OooOo00 oooOo00) {
        this.f31400OooOo0O = 1;
        this.f31402OooOoO = oooOo00;
        this.f31399OooOo = oooOo00.f31416OooO00o.iterator();
        this.f31401OooOo0o = -1;
    }

    public o0OoOo0(o00Oo0 o00oo0, byte b) {
        this.f31400OooOo0O = 2;
        this.f31402OooOoO = o00oo0;
        this.f31399OooOo = ((o00O0o.Oooo000) o00oo0.f31392OooO0O0).iterator();
        this.f31401OooOo0o = -1;
    }
}
