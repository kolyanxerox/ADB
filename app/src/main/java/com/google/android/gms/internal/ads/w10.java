package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class w10 {

    /* renamed from: OooO00o */
    public int f25171OooO00o;

    /* renamed from: OooO0O0 */
    public int f25172OooO0O0;

    /* renamed from: OooO0OO */
    public int f25173OooO0OO = 0;

    /* renamed from: OooO0Oo */
    public Object f25174OooO0Oo;

    public w10(nz0 nz0Var) {
        Charset charset = i01.f19888OooO00o;
        if (nz0Var == null) {
            throw new NullPointerException("input");
        }
        this.f25174OooO0Oo = nz0Var;
        nz0Var.f21617OooO0O0 = this;
    }

    public static void OooOo(int i) throws com.google.crypto.tink.shaded.protobuf.o000OOo {
        if ((i & 7) != 0) {
            throw com.google.crypto.tink.shaded.protobuf.o000OOo.OooO0oO();
        }
    }

    public static void OooOo0o(int i) throws com.google.crypto.tink.shaded.protobuf.o000OOo {
        if ((i & 3) != 0) {
            throw com.google.crypto.tink.shaded.protobuf.o000OOo.OooO0oO();
        }
    }

    public static final void Oooo(int i) throws k01 {
        if ((i & 3) != 0) {
            throw new k01("Failed to parse the message.");
        }
    }

    public static final void OoooO00(int i) throws k01 {
        if ((i & 7) != 0) {
            throw new k01("Failed to parse the message.");
        }
    }

    public void OooO(List list) throws com.google.crypto.tink.shaded.protobuf.o000OOo {
        int iOooOo;
        int iOooOo2;
        boolean z = list instanceof com.google.crypto.tink.shaded.protobuf.o0OOO0o;
        nz0 nz0Var = (nz0) this.f25174OooO0Oo;
        if (!z) {
            int i = this.f25171OooO00o & 7;
            if (i == 2) {
                int iOooOoO0 = nz0Var.OooOoO0();
                OooOo0o(iOooOoO0);
                int iOooO0Oo = nz0Var.OooO0Oo() + iOooOoO0;
                do {
                    list.add(Integer.valueOf(nz0Var.OooOOO0()));
                } while (nz0Var.OooO0Oo() < iOooO0Oo);
                return;
            }
            if (i != 5) {
                throw com.google.crypto.tink.shaded.protobuf.o000OOo.OooO0OO();
            }
            do {
                list.add(Integer.valueOf(nz0Var.OooOOO0()));
                if (nz0Var.OooO0o0()) {
                    return;
                } else {
                    iOooOo = nz0Var.OooOo();
                }
            } while (iOooOo == this.f25171OooO00o);
            this.f25173OooO0OO = iOooOo;
            return;
        }
        com.google.crypto.tink.shaded.protobuf.o0OOO0o o0ooo0o = (com.google.crypto.tink.shaded.protobuf.o0OOO0o) list;
        int i2 = this.f25171OooO00o & 7;
        if (i2 == 2) {
            int iOooOoO02 = nz0Var.OooOoO0();
            OooOo0o(iOooOoO02);
            int iOooO0Oo2 = nz0Var.OooO0Oo() + iOooOoO02;
            do {
                o0ooo0o.addInt(nz0Var.OooOOO0());
            } while (nz0Var.OooO0Oo() < iOooO0Oo2);
            return;
        }
        if (i2 != 5) {
            throw com.google.crypto.tink.shaded.protobuf.o000OOo.OooO0OO();
        }
        do {
            o0ooo0o.addInt(nz0Var.OooOOO0());
            if (nz0Var.OooO0o0()) {
                return;
            } else {
                iOooOo2 = nz0Var.OooOo();
            }
        } while (iOooOo2 == this.f25171OooO00o);
        this.f25173OooO0OO = iOooOo2;
    }

    public int OooO00o() {
        int i = this.f25173OooO0OO;
        if (i != 0) {
            this.f25171OooO00o = i;
            this.f25173OooO0OO = 0;
        } else {
            this.f25171OooO00o = ((nz0) this.f25174OooO0Oo).OooOo();
        }
        int i2 = this.f25171OooO00o;
        if (i2 == 0 || i2 == this.f25172OooO0O0) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    public void OooO0O0(Object obj, com.google.crypto.tink.shaded.protobuf.o000O0O0 o000o0o02, com.google.crypto.tink.shaded.protobuf.Oooo0 oooo0) {
        int i = this.f25172OooO0O0;
        this.f25172OooO0O0 = ((this.f25171OooO00o >>> 3) << 3) | 4;
        try {
            o000o0o02.OooO0OO(obj, this, oooo0);
            if (this.f25171OooO00o == this.f25172OooO0O0) {
            } else {
                throw com.google.crypto.tink.shaded.protobuf.o000OOo.OooO0oO();
            }
        } finally {
            this.f25172OooO0O0 = i;
        }
    }

    public void OooO0OO(Object obj, com.google.crypto.tink.shaded.protobuf.o000O0O0 o000o0o02, com.google.crypto.tink.shaded.protobuf.Oooo0 oooo0) throws com.google.crypto.tink.shaded.protobuf.o000OOo {
        nz0 nz0Var = (nz0) this.f25174OooO0Oo;
        int iOooOoO0 = nz0Var.OooOoO0();
        if (nz0Var.f21616OooO00o >= 100) {
            throw new com.google.crypto.tink.shaded.protobuf.o000OOo("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iOooO0oo = nz0Var.OooO0oo(iOooOoO0);
        nz0Var.f21616OooO00o++;
        o000o0o02.OooO0OO(obj, this, oooo0);
        nz0Var.OooO00o(0);
        nz0Var.f21616OooO00o--;
        nz0Var.OooO0oO(iOooO0oo);
    }

    public void OooO0Oo(List list) throws com.google.crypto.tink.shaded.protobuf.o000OOo {
        int iOooOo;
        int iOooOo2;
        boolean z = list instanceof com.google.crypto.tink.shaded.protobuf.OooO0o;
        nz0 nz0Var = (nz0) this.f25174OooO0Oo;
        if (!z) {
            int i = this.f25171OooO00o & 7;
            if (i == 0) {
                do {
                    list.add(Boolean.valueOf(nz0Var.OooO()));
                    if (nz0Var.OooO0o0()) {
                        return;
                    } else {
                        iOooOo = nz0Var.OooOo();
                    }
                } while (iOooOo == this.f25171OooO00o);
                this.f25173OooO0OO = iOooOo;
                return;
            }
            if (i != 2) {
                throw com.google.crypto.tink.shaded.protobuf.o000OOo.OooO0OO();
            }
            int iOooO0Oo = nz0Var.OooO0Oo() + nz0Var.OooOoO0();
            do {
                list.add(Boolean.valueOf(nz0Var.OooO()));
            } while (nz0Var.OooO0Oo() < iOooO0Oo);
            OooOo0(iOooO0Oo);
            return;
        }
        com.google.crypto.tink.shaded.protobuf.OooO0o oooO0o = (com.google.crypto.tink.shaded.protobuf.OooO0o) list;
        int i2 = this.f25171OooO00o & 7;
        if (i2 == 0) {
            do {
                oooO0o.addBoolean(nz0Var.OooO());
                if (nz0Var.OooO0o0()) {
                    return;
                } else {
                    iOooOo2 = nz0Var.OooOo();
                }
            } while (iOooOo2 == this.f25171OooO00o);
            this.f25173OooO0OO = iOooOo2;
            return;
        }
        if (i2 != 2) {
            throw com.google.crypto.tink.shaded.protobuf.o000OOo.OooO0OO();
        }
        int iOooO0Oo2 = nz0Var.OooO0Oo() + nz0Var.OooOoO0();
        do {
            oooO0o.addBoolean(nz0Var.OooO());
        } while (nz0Var.OooO0Oo() < iOooO0Oo2);
        OooOo0(iOooO0Oo2);
    }

    public void OooO0o(List list) throws com.google.crypto.tink.shaded.protobuf.o0O0O00 {
        int iOooOo;
        if ((this.f25171OooO00o & 7) != 2) {
            throw com.google.crypto.tink.shaded.protobuf.o000OOo.OooO0OO();
        }
        do {
            list.add(OooO0o0());
            nz0 nz0Var = (nz0) this.f25174OooO0Oo;
            if (nz0Var.OooO0o0()) {
                return;
            } else {
                iOooOo = nz0Var.OooOo();
            }
        } while (iOooOo == this.f25171OooO00o);
        this.f25173OooO0OO = iOooOo;
    }

    public com.google.crypto.tink.shaded.protobuf.OooOOO0 OooO0o0() throws com.google.crypto.tink.shaded.protobuf.o0O0O00 {
        OooOo0O(2);
        return ((nz0) this.f25174OooO0Oo).OooOO0();
    }

    public void OooO0oO(List list) throws com.google.crypto.tink.shaded.protobuf.o000OOo {
        int iOooOo;
        int iOooOo2;
        boolean z = list instanceof com.google.crypto.tink.shaded.protobuf.OooOo;
        nz0 nz0Var = (nz0) this.f25174OooO0Oo;
        if (!z) {
            int i = this.f25171OooO00o & 7;
            if (i == 1) {
                do {
                    list.add(Double.valueOf(nz0Var.OooOO0O()));
                    if (nz0Var.OooO0o0()) {
                        return;
                    } else {
                        iOooOo = nz0Var.OooOo();
                    }
                } while (iOooOo == this.f25171OooO00o);
                this.f25173OooO0OO = iOooOo;
                return;
            }
            if (i != 2) {
                throw com.google.crypto.tink.shaded.protobuf.o000OOo.OooO0OO();
            }
            int iOooOoO0 = nz0Var.OooOoO0();
            OooOo(iOooOoO0);
            int iOooO0Oo = nz0Var.OooO0Oo() + iOooOoO0;
            do {
                list.add(Double.valueOf(nz0Var.OooOO0O()));
            } while (nz0Var.OooO0Oo() < iOooO0Oo);
            return;
        }
        com.google.crypto.tink.shaded.protobuf.OooOo oooOo = (com.google.crypto.tink.shaded.protobuf.OooOo) list;
        int i2 = this.f25171OooO00o & 7;
        if (i2 == 1) {
            do {
                oooOo.addDouble(nz0Var.OooOO0O());
                if (nz0Var.OooO0o0()) {
                    return;
                } else {
                    iOooOo2 = nz0Var.OooOo();
                }
            } while (iOooOo2 == this.f25171OooO00o);
            this.f25173OooO0OO = iOooOo2;
            return;
        }
        if (i2 != 2) {
            throw com.google.crypto.tink.shaded.protobuf.o000OOo.OooO0OO();
        }
        int iOooOoO02 = nz0Var.OooOoO0();
        OooOo(iOooOoO02);
        int iOooO0Oo2 = nz0Var.OooO0Oo() + iOooOoO02;
        do {
            oooOo.addDouble(nz0Var.OooOO0O());
        } while (nz0Var.OooO0Oo() < iOooO0Oo2);
    }

    public void OooO0oo(List list) throws com.google.crypto.tink.shaded.protobuf.o000OOo {
        int iOooOo;
        int iOooOo2;
        boolean z = list instanceof com.google.crypto.tink.shaded.protobuf.o0OOO0o;
        nz0 nz0Var = (nz0) this.f25174OooO0Oo;
        if (!z) {
            int i = this.f25171OooO00o & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(nz0Var.OooOO0o()));
                    if (nz0Var.OooO0o0()) {
                        return;
                    } else {
                        iOooOo = nz0Var.OooOo();
                    }
                } while (iOooOo == this.f25171OooO00o);
                this.f25173OooO0OO = iOooOo;
                return;
            }
            if (i != 2) {
                throw com.google.crypto.tink.shaded.protobuf.o000OOo.OooO0OO();
            }
            int iOooO0Oo = nz0Var.OooO0Oo() + nz0Var.OooOoO0();
            do {
                list.add(Integer.valueOf(nz0Var.OooOO0o()));
            } while (nz0Var.OooO0Oo() < iOooO0Oo);
            OooOo0(iOooO0Oo);
            return;
        }
        com.google.crypto.tink.shaded.protobuf.o0OOO0o o0ooo0o = (com.google.crypto.tink.shaded.protobuf.o0OOO0o) list;
        int i2 = this.f25171OooO00o & 7;
        if (i2 == 0) {
            do {
                o0ooo0o.addInt(nz0Var.OooOO0o());
                if (nz0Var.OooO0o0()) {
                    return;
                } else {
                    iOooOo2 = nz0Var.OooOo();
                }
            } while (iOooOo2 == this.f25171OooO00o);
            this.f25173OooO0OO = iOooOo2;
            return;
        }
        if (i2 != 2) {
            throw com.google.crypto.tink.shaded.protobuf.o000OOo.OooO0OO();
        }
        int iOooO0Oo2 = nz0Var.OooO0Oo() + nz0Var.OooOoO0();
        do {
            o0ooo0o.addInt(nz0Var.OooOO0o());
        } while (nz0Var.OooO0Oo() < iOooO0Oo2);
        OooOo0(iOooO0Oo2);
    }

    public void OooOO0(List list) throws com.google.crypto.tink.shaded.protobuf.o000OOo {
        int iOooOo;
        int iOooOo2;
        boolean z = list instanceof com.google.crypto.tink.shaded.protobuf.o0000Ooo;
        nz0 nz0Var = (nz0) this.f25174OooO0Oo;
        if (!z) {
            int i = this.f25171OooO00o & 7;
            if (i == 1) {
                do {
                    list.add(Long.valueOf(nz0Var.OooOOO()));
                    if (nz0Var.OooO0o0()) {
                        return;
                    } else {
                        iOooOo = nz0Var.OooOo();
                    }
                } while (iOooOo == this.f25171OooO00o);
                this.f25173OooO0OO = iOooOo;
                return;
            }
            if (i != 2) {
                throw com.google.crypto.tink.shaded.protobuf.o000OOo.OooO0OO();
            }
            int iOooOoO0 = nz0Var.OooOoO0();
            OooOo(iOooOoO0);
            int iOooO0Oo = nz0Var.OooO0Oo() + iOooOoO0;
            do {
                list.add(Long.valueOf(nz0Var.OooOOO()));
            } while (nz0Var.OooO0Oo() < iOooO0Oo);
            return;
        }
        com.google.crypto.tink.shaded.protobuf.o0000Ooo o0000ooo = (com.google.crypto.tink.shaded.protobuf.o0000Ooo) list;
        int i2 = this.f25171OooO00o & 7;
        if (i2 == 1) {
            do {
                o0000ooo.addLong(nz0Var.OooOOO());
                if (nz0Var.OooO0o0()) {
                    return;
                } else {
                    iOooOo2 = nz0Var.OooOo();
                }
            } while (iOooOo2 == this.f25171OooO00o);
            this.f25173OooO0OO = iOooOo2;
            return;
        }
        if (i2 != 2) {
            throw com.google.crypto.tink.shaded.protobuf.o000OOo.OooO0OO();
        }
        int iOooOoO02 = nz0Var.OooOoO0();
        OooOo(iOooOoO02);
        int iOooO0Oo2 = nz0Var.OooO0Oo() + iOooOoO02;
        do {
            o0000ooo.addLong(nz0Var.OooOOO());
        } while (nz0Var.OooO0Oo() < iOooO0Oo2);
    }

    public void OooOO0O(List list) throws com.google.crypto.tink.shaded.protobuf.o000OOo {
        int iOooOo;
        int iOooOo2;
        boolean z = list instanceof com.google.crypto.tink.shaded.protobuf.o00Oo0;
        nz0 nz0Var = (nz0) this.f25174OooO0Oo;
        if (!z) {
            int i = this.f25171OooO00o & 7;
            if (i == 2) {
                int iOooOoO0 = nz0Var.OooOoO0();
                OooOo0o(iOooOoO0);
                int iOooO0Oo = nz0Var.OooO0Oo() + iOooOoO0;
                do {
                    list.add(Float.valueOf(nz0Var.OooOOOO()));
                } while (nz0Var.OooO0Oo() < iOooO0Oo);
                return;
            }
            if (i != 5) {
                throw com.google.crypto.tink.shaded.protobuf.o000OOo.OooO0OO();
            }
            do {
                list.add(Float.valueOf(nz0Var.OooOOOO()));
                if (nz0Var.OooO0o0()) {
                    return;
                } else {
                    iOooOo = nz0Var.OooOo();
                }
            } while (iOooOo == this.f25171OooO00o);
            this.f25173OooO0OO = iOooOo;
            return;
        }
        com.google.crypto.tink.shaded.protobuf.o00Oo0 o00oo0 = (com.google.crypto.tink.shaded.protobuf.o00Oo0) list;
        int i2 = this.f25171OooO00o & 7;
        if (i2 == 2) {
            int iOooOoO02 = nz0Var.OooOoO0();
            OooOo0o(iOooOoO02);
            int iOooO0Oo2 = nz0Var.OooO0Oo() + iOooOoO02;
            do {
                o00oo0.addFloat(nz0Var.OooOOOO());
            } while (nz0Var.OooO0Oo() < iOooO0Oo2);
            return;
        }
        if (i2 != 5) {
            throw com.google.crypto.tink.shaded.protobuf.o000OOo.OooO0OO();
        }
        do {
            o00oo0.addFloat(nz0Var.OooOOOO());
            if (nz0Var.OooO0o0()) {
                return;
            } else {
                iOooOo2 = nz0Var.OooOo();
            }
        } while (iOooOo2 == this.f25171OooO00o);
        this.f25173OooO0OO = iOooOo2;
    }

    public void OooOO0o(List list) throws com.google.crypto.tink.shaded.protobuf.o000OOo {
        int iOooOo;
        int iOooOo2;
        boolean z = list instanceof com.google.crypto.tink.shaded.protobuf.o0OOO0o;
        nz0 nz0Var = (nz0) this.f25174OooO0Oo;
        if (!z) {
            int i = this.f25171OooO00o & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(nz0Var.OooOOOo()));
                    if (nz0Var.OooO0o0()) {
                        return;
                    } else {
                        iOooOo = nz0Var.OooOo();
                    }
                } while (iOooOo == this.f25171OooO00o);
                this.f25173OooO0OO = iOooOo;
                return;
            }
            if (i != 2) {
                throw com.google.crypto.tink.shaded.protobuf.o000OOo.OooO0OO();
            }
            int iOooO0Oo = nz0Var.OooO0Oo() + nz0Var.OooOoO0();
            do {
                list.add(Integer.valueOf(nz0Var.OooOOOo()));
            } while (nz0Var.OooO0Oo() < iOooO0Oo);
            OooOo0(iOooO0Oo);
            return;
        }
        com.google.crypto.tink.shaded.protobuf.o0OOO0o o0ooo0o = (com.google.crypto.tink.shaded.protobuf.o0OOO0o) list;
        int i2 = this.f25171OooO00o & 7;
        if (i2 == 0) {
            do {
                o0ooo0o.addInt(nz0Var.OooOOOo());
                if (nz0Var.OooO0o0()) {
                    return;
                } else {
                    iOooOo2 = nz0Var.OooOo();
                }
            } while (iOooOo2 == this.f25171OooO00o);
            this.f25173OooO0OO = iOooOo2;
            return;
        }
        if (i2 != 2) {
            throw com.google.crypto.tink.shaded.protobuf.o000OOo.OooO0OO();
        }
        int iOooO0Oo2 = nz0Var.OooO0Oo() + nz0Var.OooOoO0();
        do {
            o0ooo0o.addInt(nz0Var.OooOOOo());
        } while (nz0Var.OooO0Oo() < iOooO0Oo2);
        OooOo0(iOooO0Oo2);
    }

    public void OooOOO(List list) throws com.google.crypto.tink.shaded.protobuf.o000OOo {
        int iOooOo;
        int iOooOo2;
        boolean z = list instanceof com.google.crypto.tink.shaded.protobuf.o0OOO0o;
        nz0 nz0Var = (nz0) this.f25174OooO0Oo;
        if (!z) {
            int i = this.f25171OooO00o & 7;
            if (i == 2) {
                int iOooOoO0 = nz0Var.OooOoO0();
                OooOo0o(iOooOoO0);
                int iOooO0Oo = nz0Var.OooO0Oo() + iOooOoO0;
                do {
                    list.add(Integer.valueOf(nz0Var.OooOOo()));
                } while (nz0Var.OooO0Oo() < iOooO0Oo);
                return;
            }
            if (i != 5) {
                throw com.google.crypto.tink.shaded.protobuf.o000OOo.OooO0OO();
            }
            do {
                list.add(Integer.valueOf(nz0Var.OooOOo()));
                if (nz0Var.OooO0o0()) {
                    return;
                } else {
                    iOooOo = nz0Var.OooOo();
                }
            } while (iOooOo == this.f25171OooO00o);
            this.f25173OooO0OO = iOooOo;
            return;
        }
        com.google.crypto.tink.shaded.protobuf.o0OOO0o o0ooo0o = (com.google.crypto.tink.shaded.protobuf.o0OOO0o) list;
        int i2 = this.f25171OooO00o & 7;
        if (i2 == 2) {
            int iOooOoO02 = nz0Var.OooOoO0();
            OooOo0o(iOooOoO02);
            int iOooO0Oo2 = nz0Var.OooO0Oo() + iOooOoO02;
            do {
                o0ooo0o.addInt(nz0Var.OooOOo());
            } while (nz0Var.OooO0Oo() < iOooO0Oo2);
            return;
        }
        if (i2 != 5) {
            throw com.google.crypto.tink.shaded.protobuf.o000OOo.OooO0OO();
        }
        do {
            o0ooo0o.addInt(nz0Var.OooOOo());
            if (nz0Var.OooO0o0()) {
                return;
            } else {
                iOooOo2 = nz0Var.OooOo();
            }
        } while (iOooOo2 == this.f25171OooO00o);
        this.f25173OooO0OO = iOooOo2;
    }

    public void OooOOO0(List list) throws com.google.crypto.tink.shaded.protobuf.o000OOo {
        int iOooOo;
        int iOooOo2;
        boolean z = list instanceof com.google.crypto.tink.shaded.protobuf.o0000Ooo;
        nz0 nz0Var = (nz0) this.f25174OooO0Oo;
        if (!z) {
            int i = this.f25171OooO00o & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(nz0Var.OooOOo0()));
                    if (nz0Var.OooO0o0()) {
                        return;
                    } else {
                        iOooOo = nz0Var.OooOo();
                    }
                } while (iOooOo == this.f25171OooO00o);
                this.f25173OooO0OO = iOooOo;
                return;
            }
            if (i != 2) {
                throw com.google.crypto.tink.shaded.protobuf.o000OOo.OooO0OO();
            }
            int iOooO0Oo = nz0Var.OooO0Oo() + nz0Var.OooOoO0();
            do {
                list.add(Long.valueOf(nz0Var.OooOOo0()));
            } while (nz0Var.OooO0Oo() < iOooO0Oo);
            OooOo0(iOooO0Oo);
            return;
        }
        com.google.crypto.tink.shaded.protobuf.o0000Ooo o0000ooo = (com.google.crypto.tink.shaded.protobuf.o0000Ooo) list;
        int i2 = this.f25171OooO00o & 7;
        if (i2 == 0) {
            do {
                o0000ooo.addLong(nz0Var.OooOOo0());
                if (nz0Var.OooO0o0()) {
                    return;
                } else {
                    iOooOo2 = nz0Var.OooOo();
                }
            } while (iOooOo2 == this.f25171OooO00o);
            this.f25173OooO0OO = iOooOo2;
            return;
        }
        if (i2 != 2) {
            throw com.google.crypto.tink.shaded.protobuf.o000OOo.OooO0OO();
        }
        int iOooO0Oo2 = nz0Var.OooO0Oo() + nz0Var.OooOoO0();
        do {
            o0000ooo.addLong(nz0Var.OooOOo0());
        } while (nz0Var.OooO0Oo() < iOooO0Oo2);
        OooOo0(iOooO0Oo2);
    }

    public void OooOOOO(List list) throws com.google.crypto.tink.shaded.protobuf.o000OOo {
        int iOooOo;
        int iOooOo2;
        boolean z = list instanceof com.google.crypto.tink.shaded.protobuf.o0000Ooo;
        nz0 nz0Var = (nz0) this.f25174OooO0Oo;
        if (!z) {
            int i = this.f25171OooO00o & 7;
            if (i == 1) {
                do {
                    list.add(Long.valueOf(nz0Var.OooOOoo()));
                    if (nz0Var.OooO0o0()) {
                        return;
                    } else {
                        iOooOo = nz0Var.OooOo();
                    }
                } while (iOooOo == this.f25171OooO00o);
                this.f25173OooO0OO = iOooOo;
                return;
            }
            if (i != 2) {
                throw com.google.crypto.tink.shaded.protobuf.o000OOo.OooO0OO();
            }
            int iOooOoO0 = nz0Var.OooOoO0();
            OooOo(iOooOoO0);
            int iOooO0Oo = nz0Var.OooO0Oo() + iOooOoO0;
            do {
                list.add(Long.valueOf(nz0Var.OooOOoo()));
            } while (nz0Var.OooO0Oo() < iOooO0Oo);
            return;
        }
        com.google.crypto.tink.shaded.protobuf.o0000Ooo o0000ooo = (com.google.crypto.tink.shaded.protobuf.o0000Ooo) list;
        int i2 = this.f25171OooO00o & 7;
        if (i2 == 1) {
            do {
                o0000ooo.addLong(nz0Var.OooOOoo());
                if (nz0Var.OooO0o0()) {
                    return;
                } else {
                    iOooOo2 = nz0Var.OooOo();
                }
            } while (iOooOo2 == this.f25171OooO00o);
            this.f25173OooO0OO = iOooOo2;
            return;
        }
        if (i2 != 2) {
            throw com.google.crypto.tink.shaded.protobuf.o000OOo.OooO0OO();
        }
        int iOooOoO02 = nz0Var.OooOoO0();
        OooOo(iOooOoO02);
        int iOooO0Oo2 = nz0Var.OooO0Oo() + iOooOoO02;
        do {
            o0000ooo.addLong(nz0Var.OooOOoo());
        } while (nz0Var.OooO0Oo() < iOooO0Oo2);
    }

    public void OooOOOo(List list) throws com.google.crypto.tink.shaded.protobuf.o000OOo {
        int iOooOo;
        int iOooOo2;
        boolean z = list instanceof com.google.crypto.tink.shaded.protobuf.o0OOO0o;
        nz0 nz0Var = (nz0) this.f25174OooO0Oo;
        if (!z) {
            int i = this.f25171OooO00o & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(nz0Var.OooOo00()));
                    if (nz0Var.OooO0o0()) {
                        return;
                    } else {
                        iOooOo = nz0Var.OooOo();
                    }
                } while (iOooOo == this.f25171OooO00o);
                this.f25173OooO0OO = iOooOo;
                return;
            }
            if (i != 2) {
                throw com.google.crypto.tink.shaded.protobuf.o000OOo.OooO0OO();
            }
            int iOooO0Oo = nz0Var.OooO0Oo() + nz0Var.OooOoO0();
            do {
                list.add(Integer.valueOf(nz0Var.OooOo00()));
            } while (nz0Var.OooO0Oo() < iOooO0Oo);
            OooOo0(iOooO0Oo);
            return;
        }
        com.google.crypto.tink.shaded.protobuf.o0OOO0o o0ooo0o = (com.google.crypto.tink.shaded.protobuf.o0OOO0o) list;
        int i2 = this.f25171OooO00o & 7;
        if (i2 == 0) {
            do {
                o0ooo0o.addInt(nz0Var.OooOo00());
                if (nz0Var.OooO0o0()) {
                    return;
                } else {
                    iOooOo2 = nz0Var.OooOo();
                }
            } while (iOooOo2 == this.f25171OooO00o);
            this.f25173OooO0OO = iOooOo2;
            return;
        }
        if (i2 != 2) {
            throw com.google.crypto.tink.shaded.protobuf.o000OOo.OooO0OO();
        }
        int iOooO0Oo2 = nz0Var.OooO0Oo() + nz0Var.OooOoO0();
        do {
            o0ooo0o.addInt(nz0Var.OooOo00());
        } while (nz0Var.OooO0Oo() < iOooO0Oo2);
        OooOo0(iOooO0Oo2);
    }

    public void OooOOo(List list, boolean z) throws com.google.crypto.tink.shaded.protobuf.o0O0O00 {
        String strOooOo0O;
        int iOooOo;
        int iOooOo2;
        if ((this.f25171OooO00o & 7) != 2) {
            throw com.google.crypto.tink.shaded.protobuf.o000OOo.OooO0OO();
        }
        boolean z2 = list instanceof com.google.crypto.tink.shaded.protobuf.o00000;
        nz0 nz0Var = (nz0) this.f25174OooO0Oo;
        if (z2 && !z) {
            com.google.crypto.tink.shaded.protobuf.o00000 o00000Var = (com.google.crypto.tink.shaded.protobuf.o00000) list;
            do {
                o00000Var.OooO0oo(OooO0o0());
                if (nz0Var.OooO0o0()) {
                    return;
                } else {
                    iOooOo2 = nz0Var.OooOo();
                }
            } while (iOooOo2 == this.f25171OooO00o);
            this.f25173OooO0OO = iOooOo2;
            return;
        }
        do {
            if (z) {
                OooOo0O(2);
                strOooOo0O = nz0Var.OooOo0o();
            } else {
                OooOo0O(2);
                strOooOo0O = nz0Var.OooOo0O();
            }
            list.add(strOooOo0O);
            if (nz0Var.OooO0o0()) {
                return;
            } else {
                iOooOo = nz0Var.OooOo();
            }
        } while (iOooOo == this.f25171OooO00o);
        this.f25173OooO0OO = iOooOo;
    }

    public void OooOOo0(List list) throws com.google.crypto.tink.shaded.protobuf.o000OOo {
        int iOooOo;
        int iOooOo2;
        boolean z = list instanceof com.google.crypto.tink.shaded.protobuf.o0000Ooo;
        nz0 nz0Var = (nz0) this.f25174OooO0Oo;
        if (!z) {
            int i = this.f25171OooO00o & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(nz0Var.OooOo0()));
                    if (nz0Var.OooO0o0()) {
                        return;
                    } else {
                        iOooOo = nz0Var.OooOo();
                    }
                } while (iOooOo == this.f25171OooO00o);
                this.f25173OooO0OO = iOooOo;
                return;
            }
            if (i != 2) {
                throw com.google.crypto.tink.shaded.protobuf.o000OOo.OooO0OO();
            }
            int iOooO0Oo = nz0Var.OooO0Oo() + nz0Var.OooOoO0();
            do {
                list.add(Long.valueOf(nz0Var.OooOo0()));
            } while (nz0Var.OooO0Oo() < iOooO0Oo);
            OooOo0(iOooO0Oo);
            return;
        }
        com.google.crypto.tink.shaded.protobuf.o0000Ooo o0000ooo = (com.google.crypto.tink.shaded.protobuf.o0000Ooo) list;
        int i2 = this.f25171OooO00o & 7;
        if (i2 == 0) {
            do {
                o0000ooo.addLong(nz0Var.OooOo0());
                if (nz0Var.OooO0o0()) {
                    return;
                } else {
                    iOooOo2 = nz0Var.OooOo();
                }
            } while (iOooOo2 == this.f25171OooO00o);
            this.f25173OooO0OO = iOooOo2;
            return;
        }
        if (i2 != 2) {
            throw com.google.crypto.tink.shaded.protobuf.o000OOo.OooO0OO();
        }
        int iOooO0Oo2 = nz0Var.OooO0Oo() + nz0Var.OooOoO0();
        do {
            o0000ooo.addLong(nz0Var.OooOo0());
        } while (nz0Var.OooO0Oo() < iOooO0Oo2);
        OooOo0(iOooO0Oo2);
    }

    public void OooOOoo(List list) throws com.google.crypto.tink.shaded.protobuf.o000OOo {
        int iOooOo;
        int iOooOo2;
        boolean z = list instanceof com.google.crypto.tink.shaded.protobuf.o0OOO0o;
        nz0 nz0Var = (nz0) this.f25174OooO0Oo;
        if (!z) {
            int i = this.f25171OooO00o & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(nz0Var.OooOoO0()));
                    if (nz0Var.OooO0o0()) {
                        return;
                    } else {
                        iOooOo = nz0Var.OooOo();
                    }
                } while (iOooOo == this.f25171OooO00o);
                this.f25173OooO0OO = iOooOo;
                return;
            }
            if (i != 2) {
                throw com.google.crypto.tink.shaded.protobuf.o000OOo.OooO0OO();
            }
            int iOooO0Oo = nz0Var.OooO0Oo() + nz0Var.OooOoO0();
            do {
                list.add(Integer.valueOf(nz0Var.OooOoO0()));
            } while (nz0Var.OooO0Oo() < iOooO0Oo);
            OooOo0(iOooO0Oo);
            return;
        }
        com.google.crypto.tink.shaded.protobuf.o0OOO0o o0ooo0o = (com.google.crypto.tink.shaded.protobuf.o0OOO0o) list;
        int i2 = this.f25171OooO00o & 7;
        if (i2 == 0) {
            do {
                o0ooo0o.addInt(nz0Var.OooOoO0());
                if (nz0Var.OooO0o0()) {
                    return;
                } else {
                    iOooOo2 = nz0Var.OooOo();
                }
            } while (iOooOo2 == this.f25171OooO00o);
            this.f25173OooO0OO = iOooOo2;
            return;
        }
        if (i2 != 2) {
            throw com.google.crypto.tink.shaded.protobuf.o000OOo.OooO0OO();
        }
        int iOooO0Oo2 = nz0Var.OooO0Oo() + nz0Var.OooOoO0();
        do {
            o0ooo0o.addInt(nz0Var.OooOoO0());
        } while (nz0Var.OooO0Oo() < iOooO0Oo2);
        OooOo0(iOooO0Oo2);
    }

    public void OooOo0(int i) throws com.google.crypto.tink.shaded.protobuf.o000OOo {
        if (((nz0) this.f25174OooO0Oo).OooO0Oo() != i) {
            throw com.google.crypto.tink.shaded.protobuf.o000OOo.OooO0oo();
        }
    }

    public void OooOo00(List list) throws com.google.crypto.tink.shaded.protobuf.o000OOo {
        int iOooOo;
        int iOooOo2;
        boolean z = list instanceof com.google.crypto.tink.shaded.protobuf.o0000Ooo;
        nz0 nz0Var = (nz0) this.f25174OooO0Oo;
        if (!z) {
            int i = this.f25171OooO00o & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(nz0Var.OooOoO()));
                    if (nz0Var.OooO0o0()) {
                        return;
                    } else {
                        iOooOo = nz0Var.OooOo();
                    }
                } while (iOooOo == this.f25171OooO00o);
                this.f25173OooO0OO = iOooOo;
                return;
            }
            if (i != 2) {
                throw com.google.crypto.tink.shaded.protobuf.o000OOo.OooO0OO();
            }
            int iOooO0Oo = nz0Var.OooO0Oo() + nz0Var.OooOoO0();
            do {
                list.add(Long.valueOf(nz0Var.OooOoO()));
            } while (nz0Var.OooO0Oo() < iOooO0Oo);
            OooOo0(iOooO0Oo);
            return;
        }
        com.google.crypto.tink.shaded.protobuf.o0000Ooo o0000ooo = (com.google.crypto.tink.shaded.protobuf.o0000Ooo) list;
        int i2 = this.f25171OooO00o & 7;
        if (i2 == 0) {
            do {
                o0000ooo.addLong(nz0Var.OooOoO());
                if (nz0Var.OooO0o0()) {
                    return;
                } else {
                    iOooOo2 = nz0Var.OooOo();
                }
            } while (iOooOo2 == this.f25171OooO00o);
            this.f25173OooO0OO = iOooOo2;
            return;
        }
        if (i2 != 2) {
            throw com.google.crypto.tink.shaded.protobuf.o000OOo.OooO0OO();
        }
        int iOooO0Oo2 = nz0Var.OooO0Oo() + nz0Var.OooOoO0();
        do {
            o0000ooo.addLong(nz0Var.OooOoO());
        } while (nz0Var.OooO0Oo() < iOooO0Oo2);
        OooOo0(iOooO0Oo2);
    }

    public void OooOo0O(int i) throws com.google.crypto.tink.shaded.protobuf.o0O0O00 {
        if ((this.f25171OooO00o & 7) != i) {
            throw com.google.crypto.tink.shaded.protobuf.o000OOo.OooO0OO();
        }
    }

    public void OooOoO(h01 h01Var) throws k01 {
        int iOooo0oo;
        int i = this.f25171OooO00o & 7;
        nz0 nz0Var = (nz0) this.f25174OooO0Oo;
        if (i == 2) {
            int iOooo = nz0Var.Oooo();
            Oooo(iOooo);
            int iOooo00o = nz0Var.Oooo00o() + iOooo;
            do {
                h01Var.add(Float.valueOf(nz0Var.Oooo00O()));
            } while (nz0Var.Oooo00o() < iOooo00o);
            return;
        }
        if (i != 5) {
            throw new j01();
        }
        do {
            h01Var.add(Float.valueOf(nz0Var.Oooo00O()));
            if (nz0Var.OooOoOO()) {
                return;
            } else {
                iOooo0oo = nz0Var.Oooo0oo();
            }
        } while (iOooo0oo == this.f25171OooO00o);
        this.f25173OooO0OO = iOooo0oo;
    }

    public void OooOoO0(h01 h01Var) throws k01 {
        int iOooo0oo;
        int iOooo0oo2;
        boolean z = h01Var instanceof p01;
        nz0 nz0Var = (nz0) this.f25174OooO0Oo;
        if (z) {
            p01 p01Var = (p01) h01Var;
            int i = this.f25171OooO00o & 7;
            if (i != 1) {
                if (i != 2) {
                    throw new j01();
                }
                int iOooo = nz0Var.Oooo();
                OoooO00(iOooo);
                int iOooo00o = nz0Var.Oooo00o() + iOooo;
                do {
                    p01Var.OooO0oO(nz0Var.OoooO00());
                } while (nz0Var.Oooo00o() < iOooo00o);
                return;
            }
            do {
                p01Var.OooO0oO(nz0Var.OoooO00());
                if (nz0Var.OooOoOO()) {
                    return;
                } else {
                    iOooo0oo2 = nz0Var.Oooo0oo();
                }
            } while (iOooo0oo2 == this.f25171OooO00o);
        } else {
            int i2 = this.f25171OooO00o & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new j01();
                }
                int iOooo2 = nz0Var.Oooo();
                OoooO00(iOooo2);
                int iOooo00o2 = nz0Var.Oooo00o() + iOooo2;
                do {
                    h01Var.add(Long.valueOf(nz0Var.OoooO00()));
                } while (nz0Var.Oooo00o() < iOooo00o2);
                return;
            }
            do {
                h01Var.add(Long.valueOf(nz0Var.OoooO00()));
                if (nz0Var.OooOoOO()) {
                    return;
                } else {
                    iOooo0oo = nz0Var.Oooo0oo();
                }
            } while (iOooo0oo == this.f25171OooO00o);
            iOooo0oo2 = iOooo0oo;
        }
        this.f25173OooO0OO = iOooo0oo2;
    }

    public void OooOoOO(h01 h01Var, g11 g11Var, tz0 tz0Var) throws j01 {
        int iOooo0oo;
        int i = this.f25171OooO00o;
        if ((i & 7) != 3) {
            throw new j01();
        }
        do {
            zz0 zz0VarZze = g11Var.zze();
            Oooo0o0(zz0VarZze, g11Var, tz0Var);
            g11Var.OooO00o(zz0VarZze);
            h01Var.add(zz0VarZze);
            nz0 nz0Var = (nz0) this.f25174OooO0Oo;
            if (nz0Var.OooOoOO() || this.f25173OooO0OO != 0) {
                return;
            } else {
                iOooo0oo = nz0Var.Oooo0oo();
            }
        } while (iOooo0oo == i);
        this.f25173OooO0OO = iOooo0oo;
    }

    public void OooOoo(h01 h01Var) throws k01 {
        int iOooo0oo;
        int iOooo0oo2;
        boolean z = h01Var instanceof p01;
        nz0 nz0Var = (nz0) this.f25174OooO0Oo;
        if (z) {
            p01 p01Var = (p01) h01Var;
            int i = this.f25171OooO00o & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new j01();
                }
                int iOooo00o = nz0Var.Oooo00o() + nz0Var.Oooo();
                do {
                    p01Var.OooO0oO(nz0Var.OoooO0());
                } while (nz0Var.Oooo00o() < iOooo00o);
                Oooo0oO(iOooo00o);
                return;
            }
            do {
                p01Var.OooO0oO(nz0Var.OoooO0());
                if (nz0Var.OooOoOO()) {
                    return;
                } else {
                    iOooo0oo2 = nz0Var.Oooo0oo();
                }
            } while (iOooo0oo2 == this.f25171OooO00o);
        } else {
            int i2 = this.f25171OooO00o & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new j01();
                }
                int iOooo00o2 = nz0Var.Oooo00o() + nz0Var.Oooo();
                do {
                    h01Var.add(Long.valueOf(nz0Var.OoooO0()));
                } while (nz0Var.Oooo00o() < iOooo00o2);
                Oooo0oO(iOooo00o2);
                return;
            }
            do {
                h01Var.add(Long.valueOf(nz0Var.OoooO0()));
                if (nz0Var.OooOoOO()) {
                    return;
                } else {
                    iOooo0oo = nz0Var.Oooo0oo();
                }
            } while (iOooo0oo == this.f25171OooO00o);
            iOooo0oo2 = iOooo0oo;
        }
        this.f25173OooO0OO = iOooo0oo2;
    }

    public void OooOoo0(h01 h01Var) throws k01 {
        int iOooo0oo;
        int iOooo0oo2;
        boolean z = h01Var instanceof a01;
        nz0 nz0Var = (nz0) this.f25174OooO0Oo;
        if (z) {
            a01 a01Var = (a01) h01Var;
            int i = this.f25171OooO00o & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new j01();
                }
                int iOooo00o = nz0Var.Oooo00o() + nz0Var.Oooo();
                do {
                    a01Var.OooO0oO(nz0Var.Oooo0o0());
                } while (nz0Var.Oooo00o() < iOooo00o);
                Oooo0oO(iOooo00o);
                return;
            }
            do {
                a01Var.OooO0oO(nz0Var.Oooo0o0());
                if (nz0Var.OooOoOO()) {
                    return;
                } else {
                    iOooo0oo2 = nz0Var.Oooo0oo();
                }
            } while (iOooo0oo2 == this.f25171OooO00o);
        } else {
            int i2 = this.f25171OooO00o & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new j01();
                }
                int iOooo00o2 = nz0Var.Oooo00o() + nz0Var.Oooo();
                do {
                    h01Var.add(Integer.valueOf(nz0Var.Oooo0o0()));
                } while (nz0Var.Oooo00o() < iOooo00o2);
                Oooo0oO(iOooo00o2);
                return;
            }
            do {
                h01Var.add(Integer.valueOf(nz0Var.Oooo0o0()));
                if (nz0Var.OooOoOO()) {
                    return;
                } else {
                    iOooo0oo = nz0Var.Oooo0oo();
                }
            } while (iOooo0oo == this.f25171OooO00o);
            iOooo0oo2 = iOooo0oo;
        }
        this.f25173OooO0OO = iOooo0oo2;
    }

    public void OooOooO(h01 h01Var, g11 g11Var, tz0 tz0Var) throws k01 {
        int iOooo0oo;
        int i = this.f25171OooO00o;
        if ((i & 7) != 2) {
            throw new j01();
        }
        do {
            zz0 zz0VarZze = g11Var.zze();
            Oooo0o(zz0VarZze, g11Var, tz0Var);
            g11Var.OooO00o(zz0VarZze);
            h01Var.add(zz0VarZze);
            nz0 nz0Var = (nz0) this.f25174OooO0Oo;
            if (nz0Var.OooOoOO() || this.f25173OooO0OO != 0) {
                return;
            } else {
                iOooo0oo = nz0Var.Oooo0oo();
            }
        } while (iOooo0oo == i);
        this.f25173OooO0OO = iOooo0oo;
    }

    public void OooOooo(h01 h01Var) throws k01 {
        int iOooo0oo;
        int iOooo0oo2;
        boolean z = h01Var instanceof a01;
        nz0 nz0Var = (nz0) this.f25174OooO0Oo;
        if (z) {
            a01 a01Var = (a01) h01Var;
            int i = this.f25171OooO00o & 7;
            if (i == 2) {
                int iOooo = nz0Var.Oooo();
                Oooo(iOooo);
                int iOooo00o = nz0Var.Oooo00o() + iOooo;
                do {
                    a01Var.OooO0oO(nz0Var.Oooo0o());
                } while (nz0Var.Oooo00o() < iOooo00o);
                return;
            }
            if (i != 5) {
                throw new j01();
            }
            do {
                a01Var.OooO0oO(nz0Var.Oooo0o());
                if (nz0Var.OooOoOO()) {
                    return;
                } else {
                    iOooo0oo2 = nz0Var.Oooo0oo();
                }
            } while (iOooo0oo2 == this.f25171OooO00o);
        } else {
            int i2 = this.f25171OooO00o & 7;
            if (i2 == 2) {
                int iOooo2 = nz0Var.Oooo();
                Oooo(iOooo2);
                int iOooo00o2 = nz0Var.Oooo00o() + iOooo2;
                do {
                    h01Var.add(Integer.valueOf(nz0Var.Oooo0o()));
                } while (nz0Var.Oooo00o() < iOooo00o2);
                return;
            }
            if (i2 != 5) {
                throw new j01();
            }
            do {
                h01Var.add(Integer.valueOf(nz0Var.Oooo0o()));
                if (nz0Var.OooOoOO()) {
                    return;
                } else {
                    iOooo0oo = nz0Var.Oooo0oo();
                }
            } while (iOooo0oo == this.f25171OooO00o);
            iOooo0oo2 = iOooo0oo;
        }
        this.f25173OooO0OO = iOooo0oo2;
    }

    public void Oooo0(h01 h01Var, boolean z) throws j01 {
        String strOoooOOO;
        int iOooo0oo;
        if ((this.f25171OooO00o & 7) != 2) {
            throw new j01();
        }
        do {
            nz0 nz0Var = (nz0) this.f25174OooO0Oo;
            if (z) {
                Oooo0oo(2);
                strOoooOOO = nz0Var.OoooOOo();
            } else {
                Oooo0oo(2);
                strOoooOOO = nz0Var.OoooOOO();
            }
            h01Var.add(strOoooOOO);
            if (nz0Var.OooOoOO()) {
                return;
            } else {
                iOooo0oo = nz0Var.Oooo0oo();
            }
        } while (iOooo0oo == this.f25171OooO00o);
        this.f25173OooO0OO = iOooo0oo;
    }

    public void Oooo000(h01 h01Var) throws k01 {
        int iOooo0oo;
        int iOooo0oo2;
        boolean z = h01Var instanceof p01;
        nz0 nz0Var = (nz0) this.f25174OooO0Oo;
        if (z) {
            p01 p01Var = (p01) h01Var;
            int i = this.f25171OooO00o & 7;
            if (i != 1) {
                if (i != 2) {
                    throw new j01();
                }
                int iOooo = nz0Var.Oooo();
                OoooO00(iOooo);
                int iOooo00o = nz0Var.Oooo00o() + iOooo;
                do {
                    p01Var.OooO0oO(nz0Var.OoooO0O());
                } while (nz0Var.Oooo00o() < iOooo00o);
                return;
            }
            do {
                p01Var.OooO0oO(nz0Var.OoooO0O());
                if (nz0Var.OooOoOO()) {
                    return;
                } else {
                    iOooo0oo2 = nz0Var.Oooo0oo();
                }
            } while (iOooo0oo2 == this.f25171OooO00o);
        } else {
            int i2 = this.f25171OooO00o & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new j01();
                }
                int iOooo2 = nz0Var.Oooo();
                OoooO00(iOooo2);
                int iOooo00o2 = nz0Var.Oooo00o() + iOooo2;
                do {
                    h01Var.add(Long.valueOf(nz0Var.OoooO0O()));
                } while (nz0Var.Oooo00o() < iOooo00o2);
                return;
            }
            do {
                h01Var.add(Long.valueOf(nz0Var.OoooO0O()));
                if (nz0Var.OooOoOO()) {
                    return;
                } else {
                    iOooo0oo = nz0Var.Oooo0oo();
                }
            } while (iOooo0oo == this.f25171OooO00o);
            iOooo0oo2 = iOooo0oo;
        }
        this.f25173OooO0OO = iOooo0oo2;
    }

    public void Oooo00O(h01 h01Var) throws k01 {
        int iOooo0oo;
        int iOooo0oo2;
        boolean z = h01Var instanceof a01;
        nz0 nz0Var = (nz0) this.f25174OooO0Oo;
        if (z) {
            a01 a01Var = (a01) h01Var;
            int i = this.f25171OooO00o & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new j01();
                }
                int iOooo00o = nz0Var.Oooo00o() + nz0Var.Oooo();
                do {
                    a01Var.OooO0oO(nz0Var.Oooo0oO());
                } while (nz0Var.Oooo00o() < iOooo00o);
                Oooo0oO(iOooo00o);
                return;
            }
            do {
                a01Var.OooO0oO(nz0Var.Oooo0oO());
                if (nz0Var.OooOoOO()) {
                    return;
                } else {
                    iOooo0oo2 = nz0Var.Oooo0oo();
                }
            } while (iOooo0oo2 == this.f25171OooO00o);
        } else {
            int i2 = this.f25171OooO00o & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new j01();
                }
                int iOooo00o2 = nz0Var.Oooo00o() + nz0Var.Oooo();
                do {
                    h01Var.add(Integer.valueOf(nz0Var.Oooo0oO()));
                } while (nz0Var.Oooo00o() < iOooo00o2);
                Oooo0oO(iOooo00o2);
                return;
            }
            do {
                h01Var.add(Integer.valueOf(nz0Var.Oooo0oO()));
                if (nz0Var.OooOoOO()) {
                    return;
                } else {
                    iOooo0oo = nz0Var.Oooo0oo();
                }
            } while (iOooo0oo == this.f25171OooO00o);
            iOooo0oo2 = iOooo0oo;
        }
        this.f25173OooO0OO = iOooo0oo2;
    }

    public void Oooo00o(h01 h01Var) throws k01 {
        int iOooo0oo;
        int iOooo0oo2;
        boolean z = h01Var instanceof p01;
        nz0 nz0Var = (nz0) this.f25174OooO0Oo;
        if (z) {
            p01 p01Var = (p01) h01Var;
            int i = this.f25171OooO00o & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new j01();
                }
                int iOooo00o = nz0Var.Oooo00o() + nz0Var.Oooo();
                do {
                    p01Var.OooO0oO(nz0Var.OoooO());
                } while (nz0Var.Oooo00o() < iOooo00o);
                Oooo0oO(iOooo00o);
                return;
            }
            do {
                p01Var.OooO0oO(nz0Var.OoooO());
                if (nz0Var.OooOoOO()) {
                    return;
                } else {
                    iOooo0oo2 = nz0Var.Oooo0oo();
                }
            } while (iOooo0oo2 == this.f25171OooO00o);
        } else {
            int i2 = this.f25171OooO00o & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new j01();
                }
                int iOooo00o2 = nz0Var.Oooo00o() + nz0Var.Oooo();
                do {
                    h01Var.add(Long.valueOf(nz0Var.OoooO()));
                } while (nz0Var.Oooo00o() < iOooo00o2);
                Oooo0oO(iOooo00o2);
                return;
            }
            do {
                h01Var.add(Long.valueOf(nz0Var.OoooO()));
                if (nz0Var.OooOoOO()) {
                    return;
                } else {
                    iOooo0oo = nz0Var.Oooo0oo();
                }
            } while (iOooo0oo == this.f25171OooO00o);
            iOooo0oo2 = iOooo0oo;
        }
        this.f25173OooO0OO = iOooo0oo2;
    }

    public void Oooo0O0(h01 h01Var) throws k01 {
        int iOooo0oo;
        int iOooo0oo2;
        boolean z = h01Var instanceof a01;
        nz0 nz0Var = (nz0) this.f25174OooO0Oo;
        if (z) {
            a01 a01Var = (a01) h01Var;
            int i = this.f25171OooO00o & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new j01();
                }
                int iOooo00o = nz0Var.Oooo00o() + nz0Var.Oooo();
                do {
                    a01Var.OooO0oO(nz0Var.Oooo());
                } while (nz0Var.Oooo00o() < iOooo00o);
                Oooo0oO(iOooo00o);
                return;
            }
            do {
                a01Var.OooO0oO(nz0Var.Oooo());
                if (nz0Var.OooOoOO()) {
                    return;
                } else {
                    iOooo0oo2 = nz0Var.Oooo0oo();
                }
            } while (iOooo0oo2 == this.f25171OooO00o);
        } else {
            int i2 = this.f25171OooO00o & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new j01();
                }
                int iOooo00o2 = nz0Var.Oooo00o() + nz0Var.Oooo();
                do {
                    h01Var.add(Integer.valueOf(nz0Var.Oooo()));
                } while (nz0Var.Oooo00o() < iOooo00o2);
                Oooo0oO(iOooo00o2);
                return;
            }
            do {
                h01Var.add(Integer.valueOf(nz0Var.Oooo()));
                if (nz0Var.OooOoOO()) {
                    return;
                } else {
                    iOooo0oo = nz0Var.Oooo0oo();
                }
            } while (iOooo0oo == this.f25171OooO00o);
            iOooo0oo2 = iOooo0oo;
        }
        this.f25173OooO0OO = iOooo0oo2;
    }

    public void Oooo0OO(h01 h01Var) throws k01 {
        int iOooo0oo;
        int iOooo0oo2;
        boolean z = h01Var instanceof p01;
        nz0 nz0Var = (nz0) this.f25174OooO0Oo;
        if (z) {
            p01 p01Var = (p01) h01Var;
            int i = this.f25171OooO00o & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new j01();
                }
                int iOooo00o = nz0Var.Oooo00o() + nz0Var.Oooo();
                do {
                    p01Var.OooO0oO(nz0Var.OoooOO0());
                } while (nz0Var.Oooo00o() < iOooo00o);
                Oooo0oO(iOooo00o);
                return;
            }
            do {
                p01Var.OooO0oO(nz0Var.OoooOO0());
                if (nz0Var.OooOoOO()) {
                    return;
                } else {
                    iOooo0oo2 = nz0Var.Oooo0oo();
                }
            } while (iOooo0oo2 == this.f25171OooO00o);
        } else {
            int i2 = this.f25171OooO00o & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new j01();
                }
                int iOooo00o2 = nz0Var.Oooo00o() + nz0Var.Oooo();
                do {
                    h01Var.add(Long.valueOf(nz0Var.OoooOO0()));
                } while (nz0Var.Oooo00o() < iOooo00o2);
                Oooo0oO(iOooo00o2);
                return;
            }
            do {
                h01Var.add(Long.valueOf(nz0Var.OoooOO0()));
                if (nz0Var.OooOoOO()) {
                    return;
                } else {
                    iOooo0oo = nz0Var.Oooo0oo();
                }
            } while (iOooo0oo == this.f25171OooO00o);
            iOooo0oo2 = iOooo0oo;
        }
        this.f25173OooO0OO = iOooo0oo2;
    }

    public void Oooo0o(Object obj, g11 g11Var, tz0 tz0Var) throws k01 {
        nz0 nz0Var = (nz0) this.f25174OooO0Oo;
        int iOooo = nz0Var.Oooo();
        if (nz0Var.f21616OooO00o >= 100) {
            throw new k01("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iOooo0 = nz0Var.Oooo0(iOooo);
        nz0Var.f21616OooO00o++;
        g11Var.OooO(obj, this, tz0Var);
        nz0Var.OoooOo0();
        nz0Var.f21616OooO00o--;
        nz0Var.OoooOoO(iOooo0);
    }

    public void Oooo0o0(Object obj, g11 g11Var, tz0 tz0Var) {
        int i = this.f25172OooO0O0;
        this.f25172OooO0O0 = ((this.f25171OooO00o >>> 3) << 3) | 4;
        try {
            g11Var.OooO(obj, this, tz0Var);
            if (this.f25171OooO00o == this.f25172OooO0O0) {
            } else {
                throw new k01("Failed to parse the message.");
            }
        } finally {
            this.f25172OooO0O0 = i;
        }
    }

    public void Oooo0oO(int i) throws k01 {
        if (((nz0) this.f25174OooO0Oo).Oooo00o() != i) {
            throw new k01("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public void Oooo0oo(int i) {
        if ((this.f25171OooO00o & 7) != i) {
            throw new j01();
        }
    }

    public void OoooO(h01 h01Var) throws k01 {
        int iOooo0oo;
        int i = this.f25171OooO00o & 7;
        nz0 nz0Var = (nz0) this.f25174OooO0Oo;
        if (i == 0) {
            do {
                h01Var.add(Boolean.valueOf(nz0Var.OooOoo0()));
                if (nz0Var.OooOoOO()) {
                    return;
                } else {
                    iOooo0oo = nz0Var.Oooo0oo();
                }
            } while (iOooo0oo == this.f25171OooO00o);
            this.f25173OooO0OO = iOooo0oo;
            return;
        }
        if (i != 2) {
            throw new j01();
        }
        int iOooo00o = nz0Var.Oooo00o() + nz0Var.Oooo();
        do {
            h01Var.add(Boolean.valueOf(nz0Var.OooOoo0()));
        } while (nz0Var.Oooo00o() < iOooo00o);
        Oooo0oO(iOooo00o);
    }

    public long OoooO0() {
        int i = this.f25172OooO0O0;
        if (i == 0) {
            throw new NoSuchElementException();
        }
        int i2 = this.f25171OooO00o;
        long j = ((long[]) this.f25174OooO0Oo)[i2];
        this.f25171OooO00o = (i2 + 1) & this.f25173OooO0OO;
        this.f25172OooO0O0 = i - 1;
        return j;
    }

    public int OoooO0O() {
        int iOooo0oo = this.f25173OooO0OO;
        if (iOooo0oo != 0) {
            this.f25171OooO00o = iOooo0oo;
            this.f25173OooO0OO = 0;
        } else {
            iOooo0oo = ((nz0) this.f25174OooO0Oo).Oooo0oo();
            this.f25171OooO00o = iOooo0oo;
        }
        if (iOooo0oo == 0 || iOooo0oo == this.f25172OooO0O0) {
            return Integer.MAX_VALUE;
        }
        return iOooo0oo >>> 3;
    }

    public void OoooOO0(h01 h01Var) throws j01 {
        int iOooo0oo;
        if ((this.f25171OooO00o & 7) != 2) {
            throw new j01();
        }
        do {
            Oooo0oo(2);
            nz0 nz0Var = (nz0) this.f25174OooO0Oo;
            h01Var.add(nz0Var.o000oOoO());
            if (nz0Var.OooOoOO()) {
                return;
            } else {
                iOooo0oo = nz0Var.Oooo0oo();
            }
        } while (iOooo0oo == this.f25171OooO00o);
        this.f25173OooO0OO = iOooo0oo;
    }

    public void OoooOOO(h01 h01Var) throws k01 {
        int iOooo0oo;
        int iOooo0oo2;
        boolean z = h01Var instanceof a01;
        nz0 nz0Var = (nz0) this.f25174OooO0Oo;
        if (z) {
            a01 a01Var = (a01) h01Var;
            int i = this.f25171OooO00o & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new j01();
                }
                int iOooo00o = nz0Var.Oooo00o() + nz0Var.Oooo();
                do {
                    a01Var.OooO0oO(nz0Var.Oooo0O0());
                } while (nz0Var.Oooo00o() < iOooo00o);
                Oooo0oO(iOooo00o);
                return;
            }
            do {
                a01Var.OooO0oO(nz0Var.Oooo0O0());
                if (nz0Var.OooOoOO()) {
                    return;
                } else {
                    iOooo0oo2 = nz0Var.Oooo0oo();
                }
            } while (iOooo0oo2 == this.f25171OooO00o);
        } else {
            int i2 = this.f25171OooO00o & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new j01();
                }
                int iOooo00o2 = nz0Var.Oooo00o() + nz0Var.Oooo();
                do {
                    h01Var.add(Integer.valueOf(nz0Var.Oooo0O0()));
                } while (nz0Var.Oooo00o() < iOooo00o2);
                Oooo0oO(iOooo00o2);
                return;
            }
            do {
                h01Var.add(Integer.valueOf(nz0Var.Oooo0O0()));
                if (nz0Var.OooOoOO()) {
                    return;
                } else {
                    iOooo0oo = nz0Var.Oooo0oo();
                }
            } while (iOooo0oo == this.f25171OooO00o);
            iOooo0oo2 = iOooo0oo;
        }
        this.f25173OooO0OO = iOooo0oo2;
    }

    public void OoooOOo(h01 h01Var) throws k01 {
        int iOooo0oo;
        int iOooo0oo2;
        boolean z = h01Var instanceof a01;
        nz0 nz0Var = (nz0) this.f25174OooO0Oo;
        if (z) {
            a01 a01Var = (a01) h01Var;
            int i = this.f25171OooO00o & 7;
            if (i == 2) {
                int iOooo = nz0Var.Oooo();
                Oooo(iOooo);
                int iOooo00o = nz0Var.Oooo00o() + iOooo;
                do {
                    a01Var.OooO0oO(nz0Var.Oooo0OO());
                } while (nz0Var.Oooo00o() < iOooo00o);
                return;
            }
            if (i != 5) {
                throw new j01();
            }
            do {
                a01Var.OooO0oO(nz0Var.Oooo0OO());
                if (nz0Var.OooOoOO()) {
                    return;
                } else {
                    iOooo0oo2 = nz0Var.Oooo0oo();
                }
            } while (iOooo0oo2 == this.f25171OooO00o);
        } else {
            int i2 = this.f25171OooO00o & 7;
            if (i2 == 2) {
                int iOooo2 = nz0Var.Oooo();
                Oooo(iOooo2);
                int iOooo00o2 = nz0Var.Oooo00o() + iOooo2;
                do {
                    h01Var.add(Integer.valueOf(nz0Var.Oooo0OO()));
                } while (nz0Var.Oooo00o() < iOooo00o2);
                return;
            }
            if (i2 != 5) {
                throw new j01();
            }
            do {
                h01Var.add(Integer.valueOf(nz0Var.Oooo0OO()));
                if (nz0Var.OooOoOO()) {
                    return;
                } else {
                    iOooo0oo = nz0Var.Oooo0oo();
                }
            } while (iOooo0oo == this.f25171OooO00o);
            iOooo0oo2 = iOooo0oo;
        }
        this.f25173OooO0OO = iOooo0oo2;
    }

    public void o000oOoO(h01 h01Var) throws k01 {
        int iOooo0oo;
        int i = this.f25171OooO00o & 7;
        nz0 nz0Var = (nz0) this.f25174OooO0Oo;
        if (i == 1) {
            do {
                h01Var.add(Double.valueOf(nz0Var.Oooo000()));
                if (nz0Var.OooOoOO()) {
                    return;
                } else {
                    iOooo0oo = nz0Var.Oooo0oo();
                }
            } while (iOooo0oo == this.f25171OooO00o);
            this.f25173OooO0OO = iOooo0oo;
            return;
        }
        if (i != 2) {
            throw new j01();
        }
        int iOooo = nz0Var.Oooo();
        OoooO00(iOooo);
        int iOooo00o = nz0Var.Oooo00o() + iOooo;
        do {
            h01Var.add(Double.valueOf(nz0Var.Oooo000()));
        } while (nz0Var.Oooo00o() < iOooo00o);
    }

    public w10(nz0 nz0Var, boolean z) {
        com.google.crypto.tink.shaded.protobuf.oo0o0Oo.OooO00o(nz0Var, "input");
        this.f25174OooO0Oo = nz0Var;
        nz0Var.f21617OooO0O0 = this;
    }
}
