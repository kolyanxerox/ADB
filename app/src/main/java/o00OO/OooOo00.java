package o00OO;

import com.google.android.gms.internal.ads.li0;
import java.lang.annotation.Annotation;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class OooOo00 {

    /* renamed from: OooO00o */
    public final OooO0oO.Oooo000 f31872OooO00o;

    /* renamed from: OooO0O0 */
    public final oo0O.OooO0O0 f31873OooO0O0;

    /* renamed from: OooO0OO */
    public final Oooo0 f31874OooO0OO;

    /* renamed from: OooO0Oo */
    public final OooOo00[] f31875OooO0Oo;

    /* renamed from: OooO0o */
    public boolean f31876OooO0o;

    /* renamed from: OooO0o0 */
    public final li0 f31877OooO0o0;

    /* renamed from: OooO0oO */
    public String f31878OooO0oO;

    /* renamed from: OooO0oo */
    public String f31879OooO0oo;

    public OooOo00(OooO0oO.Oooo000 composer, oo0O.OooO0O0 json, Oooo0 oooo0, OooOo00[] oooOo00Arr) {
        kotlin.jvm.internal.OooOo.OooO0o0(composer, "composer");
        kotlin.jvm.internal.OooOo.OooO0o0(json, "json");
        this.f31872OooO00o = composer;
        this.f31873OooO0O0 = json;
        this.f31874OooO0OO = oooo0;
        this.f31875OooO0Oo = oooOo00Arr;
        this.f31877OooO0o0 = json.f33202OooO00o;
        int iOrdinal = oooo0.ordinal();
        if (oooOo00Arr != null) {
            OooOo00 oooOo00 = oooOo00Arr[iOrdinal];
            if (oooOo00 == null && oooOo00 == this) {
                return;
            }
            oooOo00Arr[iOrdinal] = this;
        }
    }

    public final void OooO(o00OO0OO.OooO00o serializer, Object obj) {
        String strDiscriminator;
        kotlin.jvm.internal.OooOo.OooO0o0(serializer, "serializer");
        oo0O.OooO0O0 oooO0O0 = this.f31873OooO0O0;
        li0 li0Var = oooO0O0.f33202OooO00o;
        li0Var.getClass();
        int iOrdinal = ((oo0O.OooO00o) li0Var.f20897OooOoOO).ordinal();
        if (iOrdinal == 0) {
            strDiscriminator = null;
        } else {
            if (iOrdinal == 1) {
                Oooo0o0.OooO kind = serializer.OooO0Oo().getKind();
                if (kotlin.jvm.internal.OooOo.OooO00o(kind, o00OO0o.OooOO0O.f32049OooOoO0) || kotlin.jvm.internal.OooOo.OooO00o(kind, o00OO0o.OooOO0O.f32051OooOoo0)) {
                    o00OO0o.OooO oooOOooO0Oo = serializer.OooO0Oo();
                    kotlin.jvm.internal.OooOo.OooO0o0(oooOOooO0Oo, "<this>");
                    Iterator it = oooOOooO0Oo.getAnnotations().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            strDiscriminator = (String) oooO0O0.f33202OooO00o.f20895OooOoO;
                            break;
                        }
                        Annotation annotation = (Annotation) it.next();
                        if (annotation instanceof oo0O.OooO0OO) {
                            strDiscriminator = ((oo0O.OooO0OO) annotation).discriminator();
                            break;
                        }
                    }
                }
            } else if (iOrdinal != 2) {
                throw new OooOOO0.OooO00o();
            }
            strDiscriminator = null;
        }
        if (strDiscriminator != null) {
            String strOooO0oo = serializer.OooO0Oo().OooO0oo();
            this.f31878OooO0oO = strDiscriminator;
            this.f31879OooO0oo = strOooO0oo;
        }
        serializer.OooO00o(this, obj);
    }

    public final OooOo00 OooO00o(o00OO0o.OooO descriptor) {
        OooOo00 oooOo00;
        kotlin.jvm.internal.OooOo.OooO0o0(descriptor, "descriptor");
        oo0O.OooO0O0 oooO0O0 = this.f31873OooO0O0;
        Oooo0 oooo0OooO0oO = OooOOO.OooO0oO(descriptor, oooO0O0);
        char c = oooo0OooO0oO.f31886OooOo0O;
        OooO0oO.Oooo000 oooo000 = this.f31872OooO00o;
        oooo000.OooO0OO(c);
        oooo000.f13286OooOo0O = true;
        String str = this.f31878OooO0oO;
        if (str != null) {
            String strOooO0oo = this.f31879OooO0oo;
            if (strOooO0oo == null) {
                strOooO0oo = descriptor.OooO0oo();
            }
            oooo000.OooO0O0();
            OooOO0(str);
            oooo000.OooO0OO(':');
            OooOO0(strOooO0oo);
            this.f31878OooO0oO = null;
            this.f31879OooO0oo = null;
        }
        if (this.f31874OooO0OO == oooo0OooO0oO) {
            return this;
        }
        OooOo00[] oooOo00Arr = this.f31875OooO0Oo;
        return (oooOo00Arr == null || (oooOo00 = oooOo00Arr[oooo0OooO0oO.ordinal()]) == null) ? new OooOo00(oooo000, oooO0O0, oooo0OooO0oO, oooOo00Arr) : oooOo00;
    }

    public final void OooO0O0(o00OO0o.OooO descriptor, int i) {
        kotlin.jvm.internal.OooOo.OooO0o0(descriptor, "descriptor");
        int iOrdinal = this.f31874OooO0OO.ordinal();
        boolean z = true;
        OooO0oO.Oooo000 oooo000 = this.f31872OooO00o;
        if (iOrdinal == 1) {
            if (!oooo000.f13286OooOo0O) {
                oooo000.OooO0OO(',');
            }
            oooo000.OooO0O0();
            return;
        }
        if (iOrdinal == 2) {
            if (oooo000.f13286OooOo0O) {
                this.f31876OooO0o = true;
                oooo000.OooO0O0();
                return;
            }
            if (i % 2 == 0) {
                oooo000.OooO0OO(',');
                oooo000.OooO0O0();
            } else {
                oooo000.OooO0OO(':');
                oooo000.OooO0Oo();
                z = false;
            }
            this.f31876OooO0o = z;
            return;
        }
        if (iOrdinal == 3) {
            if (i == 0) {
                this.f31876OooO0o = true;
            }
            if (i == 1) {
                oooo000.OooO0OO(',');
                oooo000.OooO0Oo();
                this.f31876OooO0o = false;
                return;
            }
            return;
        }
        if (!oooo000.f13286OooOo0O) {
            oooo000.OooO0OO(',');
        }
        oooo000.OooO0O0();
        oo0O.OooO0O0 json = this.f31873OooO0O0;
        kotlin.jvm.internal.OooOo.OooO0o0(json, "json");
        OooOOO.OooO0o(descriptor, json);
        OooOO0(descriptor.OooO0o0(i));
        oooo000.OooO0OO(':');
        oooo000.OooO0Oo();
    }

    public final void OooO0OO(int i) {
        if (this.f31876OooO0o) {
            OooOO0(String.valueOf(i));
        } else {
            ((OooO0oO.Oooo0) this.f31872OooO00o.f13287OooOo0o).OooO0oo(String.valueOf(i));
        }
    }

    public final void OooO0Oo(long j) {
        if (this.f31876OooO0o) {
            OooOO0(String.valueOf(j));
        } else {
            ((OooO0oO.Oooo0) this.f31872OooO00o.f13287OooOo0o).OooO0oo(String.valueOf(j));
        }
    }

    public final void OooO0o() {
        OooO0oO.Oooo000 oooo000 = this.f31872OooO00o;
        oooo000.getClass();
        kotlin.jvm.internal.OooOo.OooO0o0("null", "v");
        ((OooO0oO.Oooo0) oooo000.f13287OooOo0o).OooO0oo("null");
    }

    public final void OooO0o0(o00OO0o.OooO descriptor, int i, long j) {
        kotlin.jvm.internal.OooOo.OooO0o0(descriptor, "descriptor");
        OooO0O0(descriptor, i);
        OooO0Oo(j);
    }

    public final void OooO0oO(o00OO0o.OooO descriptor, int i, o00OO0OO.OooO00o serializer, Object obj) {
        kotlin.jvm.internal.OooOo.OooO0o0(descriptor, "descriptor");
        kotlin.jvm.internal.OooOo.OooO0o0(serializer, "serializer");
        if (obj != null || this.f31877OooO0o0.f20894OooOo0o) {
            kotlin.jvm.internal.OooOo.OooO0o0(descriptor, "descriptor");
            kotlin.jvm.internal.OooOo.OooO0o0(serializer, "serializer");
            OooO0O0(descriptor, i);
            if (serializer.OooO0Oo().OooO0O0()) {
                OooO(serializer, obj);
            } else if (obj == null) {
                OooO0o();
            } else {
                OooO(serializer, obj);
            }
        }
    }

    public final void OooO0oo(o00OO0o.OooO descriptor, int i, o00OO0OO.OooO00o serializer, Object obj) {
        kotlin.jvm.internal.OooOo.OooO0o0(descriptor, "descriptor");
        kotlin.jvm.internal.OooOo.OooO0o0(serializer, "serializer");
        OooO0O0(descriptor, i);
        OooO(serializer, obj);
    }

    public final void OooOO0(String value) {
        byte b;
        kotlin.jvm.internal.OooOo.OooO0o0(value, "value");
        OooO0oO.Oooo000 oooo000 = this.f31872OooO00o;
        oooo000.getClass();
        kotlin.jvm.internal.OooOo.OooO0o0(value, "value");
        OooO0oO.Oooo0 oooo0 = (OooO0oO.Oooo0) oooo000.f13287OooOo0o;
        oooo0.OooO0OO(oooo0.f13285OooOo0o, value.length() + 2);
        char[] cArr = (char[]) oooo0.f13283OooOo;
        int i = oooo0.f13285OooOo0o;
        int i2 = i + 1;
        cArr[i] = '\"';
        int length = value.length();
        value.getChars(0, length, cArr, i2);
        int i3 = length + i2;
        int i4 = i2;
        while (i4 < i3) {
            char c = cArr[i4];
            byte[] bArr = Oooo000.f31889OooO0O0;
            if (c < bArr.length && bArr[c] != 0) {
                int length2 = value.length();
                for (int i5 = i4 - i2; i5 < length2; i5++) {
                    oooo0.OooO0OO(i4, 2);
                    char cCharAt = value.charAt(i5);
                    byte[] bArr2 = Oooo000.f31889OooO0O0;
                    if (cCharAt >= bArr2.length || (b = bArr2[cCharAt]) == 0) {
                        int i6 = i4 + 1;
                        ((char[]) oooo0.f13283OooOo)[i4] = cCharAt;
                        i4 = i6;
                    } else {
                        if (b == 1) {
                            String str = Oooo000.f31888OooO00o[cCharAt];
                            kotlin.jvm.internal.OooOo.OooO0O0(str);
                            oooo0.OooO0OO(i4, str.length());
                            str.getChars(0, str.length(), (char[]) oooo0.f13283OooOo, i4);
                            int length3 = str.length() + i4;
                            oooo0.f13285OooOo0o = length3;
                            i4 = length3;
                        } else {
                            char[] cArr2 = (char[]) oooo0.f13283OooOo;
                            cArr2[i4] = '\\';
                            cArr2[i4 + 1] = (char) b;
                            i4 += 2;
                            oooo0.f13285OooOo0o = i4;
                        }
                    }
                }
                oooo0.OooO0OO(i4, 1);
                ((char[]) oooo0.f13283OooOo)[i4] = '\"';
                oooo0.f13285OooOo0o = i4 + 1;
                return;
            }
            i4++;
        }
        cArr[i3] = '\"';
        oooo0.f13285OooOo0o = i3 + 1;
    }

    public final void OooOO0O(o00OO0o.OooO descriptor, int i, String value) {
        kotlin.jvm.internal.OooOo.OooO0o0(descriptor, "descriptor");
        kotlin.jvm.internal.OooOo.OooO0o0(value, "value");
        OooO0O0(descriptor, i);
        OooOO0(value);
    }

    public final void OooOO0o(o00OO0o.OooO descriptor) {
        kotlin.jvm.internal.OooOo.OooO0o0(descriptor, "descriptor");
        Oooo0 oooo0 = this.f31874OooO0OO;
        OooO0oO.Oooo000 oooo000 = this.f31872OooO00o;
        oooo000.getClass();
        oooo000.f13286OooOo0O = false;
        oooo000.OooO0OO(oooo0.f31887OooOo0o);
    }

    public final boolean OooOOO0(o00OO0o.OooO oooO) {
        this.f31877OooO0o0.getClass();
        return false;
    }
}
