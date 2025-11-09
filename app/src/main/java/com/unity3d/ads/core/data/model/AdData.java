package com.unity3d.ads.core.data.model;

import androidx.datastore.preferences.protobuf.OooO00o;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes3.dex */
public final class AdData {
    private final String data;

    private /* synthetic */ AdData(String str) {
        this.data = str;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ AdData m13747boximpl(String str) {
        return new AdData(str);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static String m13748constructorimpl(String data) {
        OooOo.OooO0o0(data, "data");
        return data;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m13749equalsimpl(String str, Object obj) {
        return (obj instanceof AdData) && OooOo.OooO00o(str, ((AdData) obj).m13753unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m13750equalsimpl0(String str, String str2) {
        return OooOo.OooO00o(str, str2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m13751hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m13752toStringimpl(String str) {
        return OooO00o.OooO0o(')', "AdData(data=", str);
    }

    public boolean equals(Object obj) {
        return m13749equalsimpl(this.data, obj);
    }

    public final String getData() {
        return this.data;
    }

    public int hashCode() {
        return m13751hashCodeimpl(this.data);
    }

    public String toString() {
        return m13752toStringimpl(this.data);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m13753unboximpl() {
        return this.data;
    }
}
