package com.google.protobuf;

import com.google.protobuf.Internal;

/* loaded from: classes2.dex */
public final class o00O0O0O implements Internal.MapAdapter.Converter {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Internal.EnumLiteMap f28262OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Internal.EnumLite f28263OooO0O0;

    public o00O0O0O(Internal.EnumLiteMap enumLiteMap, Internal.EnumLite enumLite) {
        this.f28262OooO00o = enumLiteMap;
        this.f28263OooO0O0 = enumLite;
    }

    @Override // com.google.protobuf.Internal.MapAdapter.Converter
    public final Object doBackward(Object obj) {
        return Integer.valueOf(((Internal.EnumLite) obj).getNumber());
    }

    @Override // com.google.protobuf.Internal.MapAdapter.Converter
    public final Object doForward(Object obj) {
        Internal.EnumLite enumLiteFindValueByNumber = this.f28262OooO00o.findValueByNumber(((Integer) obj).intValue());
        return enumLiteFindValueByNumber == null ? this.f28263OooO0O0 : enumLiteFindValueByNumber;
    }
}
