package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.domain.GetByteStringId;
import com.unity3d.ads.core.extensions.TimestampExtensionsKt;
import com.unity3d.ads.core.extensions.TransactionStateExtensionsKt;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.unity3d.services.store.gpbl.bridges.PurchaseBridge;
import com.unity3d.services.store.gpbl.bridges.SkuDetailsBridge;
import gatewayprotocol.p014v1.TransactionDataKt;
import gatewayprotocol.p014v1.TransactionEventRequestOuterClass;
import kotlin.jvm.internal.OooOo;
import org.json.JSONException;

/* loaded from: classes3.dex */
public final class AndroidGetTransactionData implements GetTransactionData {
    private final GetByteStringId getByteStringId;

    public AndroidGetTransactionData(GetByteStringId getByteStringId) {
        OooOo.OooO0o0(getByteStringId, "getByteStringId");
        this.getByteStringId = getByteStringId;
    }

    @Override // com.unity3d.ads.core.domain.events.GetTransactionData
    public TransactionEventRequestOuterClass.TransactionData invoke(PurchaseBridge purchaseDetail, SkuDetailsBridge productDetail) throws JSONException {
        OooOo.OooO0o0(purchaseDetail, "purchaseDetail");
        OooOo.OooO0o0(productDetail, "productDetail");
        TransactionDataKt.Dsl.Companion companion = TransactionDataKt.Dsl.Companion;
        TransactionEventRequestOuterClass.TransactionData.Builder builderNewBuilder = TransactionEventRequestOuterClass.TransactionData.newBuilder();
        OooOo.OooO0Oo(builderNewBuilder, "newBuilder()");
        TransactionDataKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setProductId(purchaseDetail.getOriginalJson().get(InAppPurchaseMetaData.KEY_PRODUCT_ID).toString());
        dsl_create.setEventId(this.getByteStringId.invoke());
        Object obj = purchaseDetail.getOriginalJson().get("purchaseTime");
        OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.Long");
        dsl_create.setTimestamp(TimestampExtensionsKt.fromMillis(((Long) obj).longValue()));
        dsl_create.setTransactionId(purchaseDetail.getOriginalJson().get("orderId").toString());
        String string = productDetail.getOriginalJson().toString();
        OooOo.OooO0Oo(string, "productDetail.originalJson.toString()");
        dsl_create.setProduct(string);
        String string2 = purchaseDetail.getOriginalJson().toString();
        OooOo.OooO0Oo(string2, "purchaseDetail.originalJson.toString()");
        dsl_create.setTransaction(string2);
        Object obj2 = purchaseDetail.getOriginalJson().get("purchaseState");
        OooOo.OooO0OO(obj2, "null cannot be cast to non-null type kotlin.Int");
        dsl_create.setTransactionState(TransactionStateExtensionsKt.fromPurchaseState(((Integer) obj2).intValue()));
        return dsl_create._build();
    }
}
