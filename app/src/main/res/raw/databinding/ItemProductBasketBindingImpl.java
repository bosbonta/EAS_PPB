package raw.databinding;
import com.shopping.app.R;
import com.shopping.app.BR;
import com.shopping.app.databinding.ItemProductBasketBinding;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemProductBasketBindingImpl extends ItemProductBasketBinding implements com.shopping.app.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.llProductInfo, 7);
        sViewsWithIds.put(R.id.llPiece, 8);
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback10;
    @Nullable
    private final android.view.View.OnClickListener mCallback11;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemProductBasketBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private ItemProductBasketBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[1]
            , (android.widget.LinearLayout) bindings[8]
            , (android.widget.LinearLayout) bindings[7]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[2]
            );
        this.ivImage.setTag(null);
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.tvIncrease.setTag(null);
        this.tvPiece.setTag(null);
        this.tvPrice.setTag(null);
        this.tvReduce.setTag(null);
        this.tvTitle.setTag(null);
        setRootTag(root);
        // listeners
        mCallback10 = new com.shopping.app.generated.callback.OnClickListener(this, 1);
        mCallback11 = new com.shopping.app.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.productAdapter == variableId) {
            setProductAdapter((com.shopping.app.ui.basket.adapter.BasketProductsAdapter) variable);
        }
        else if (BR.dataHolder == variableId) {
            setDataHolder((com.shopping.app.data.model.ProductBasket) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setProductAdapter(@Nullable com.shopping.app.ui.basket.adapter.BasketProductsAdapter ProductAdapter) {
        this.mProductAdapter = ProductAdapter;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.productAdapter);
        super.requestRebind();
    }
    public void setDataHolder(@Nullable com.shopping.app.data.model.ProductBasket DataHolder) {
        this.mDataHolder = DataHolder;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.dataHolder);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        double dataHolderPriceDataHolderPiece = 0.0;
        java.lang.String tvPriceAndroidStringCurrencyUnitDataHolderPriceDataHolderPiece = null;
        java.lang.String dataHolderPieceToString = null;
        java.lang.Double dataHolderPrice = null;
        int androidxDatabindingViewDataBindingSafeUnboxDataHolderPiece = 0;
        java.lang.String dataHolderImage = null;
        double androidxDatabindingViewDataBindingSafeUnboxDataHolderPrice = 0.0;
        java.lang.Integer dataHolderPiece = null;
        com.shopping.app.ui.basket.adapter.BasketProductsAdapter productAdapter = mProductAdapter;
        java.lang.String dataHolderTitle = null;
        com.shopping.app.data.model.ProductBasket dataHolder = mDataHolder;

        if ((dirtyFlags & 0x6L) != 0) {



                if (dataHolder != null) {
                    // read dataHolder.price
                    dataHolderPrice = dataHolder.getPrice();
                    // read dataHolder.image
                    dataHolderImage = dataHolder.getImage();
                    // read dataHolder.piece
                    dataHolderPiece = dataHolder.getPiece();
                    // read dataHolder.title
                    dataHolderTitle = dataHolder.getTitle();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(dataHolder.price)
                androidxDatabindingViewDataBindingSafeUnboxDataHolderPrice = androidx.databinding.ViewDataBinding.safeUnbox(dataHolderPrice);
                // read androidx.databinding.ViewDataBinding.safeUnbox(dataHolder.piece)
                androidxDatabindingViewDataBindingSafeUnboxDataHolderPiece = androidx.databinding.ViewDataBinding.safeUnbox(dataHolderPiece);
                if (dataHolderPiece != null) {
                    // read dataHolder.piece.toString()
                    dataHolderPieceToString = dataHolderPiece.toString();
                }


                // read (androidx.databinding.ViewDataBinding.safeUnbox(dataHolder.price)) * (androidx.databinding.ViewDataBinding.safeUnbox(dataHolder.piece))
                dataHolderPriceDataHolderPiece = (androidxDatabindingViewDataBindingSafeUnboxDataHolderPrice) * (androidxDatabindingViewDataBindingSafeUnboxDataHolderPiece);


                // read @android:string/currency_unit
                tvPriceAndroidStringCurrencyUnitDataHolderPriceDataHolderPiece = tvPrice.getResources().getString(R.string.currency_unit, dataHolderPriceDataHolderPiece);
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            com.shopping.app.utils.BindingAdapters.loadImage(this.ivImage, dataHolderImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvPiece, dataHolderPieceToString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvPrice, tvPriceAndroidStringCurrencyUnitDataHolderPriceDataHolderPiece);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTitle, dataHolderTitle);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.tvIncrease.setOnClickListener(mCallback10);
            this.tvReduce.setOnClickListener(mCallback11);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // productAdapter != null
                boolean productAdapterJavaLangObjectNull = false;
                // productAdapter.productPieceUpdateListener
                com.shopping.app.ui.basket.ProductPieceUpdateListener productAdapterProductPieceUpdateListener = null;
                // productAdapter
                com.shopping.app.ui.basket.adapter.BasketProductsAdapter productAdapter = mProductAdapter;
                // dataHolder
                com.shopping.app.data.model.ProductBasket dataHolder = mDataHolder;
                // productAdapter.productPieceUpdateListener != null
                boolean productAdapterProductPieceUpdateListenerJavaLangObjectNull = false;



                productAdapterJavaLangObjectNull = (productAdapter) != (null);
                if (productAdapterJavaLangObjectNull) {


                    productAdapterProductPieceUpdateListener = productAdapter.getProductPieceUpdateListener();

                    productAdapterProductPieceUpdateListenerJavaLangObjectNull = (productAdapterProductPieceUpdateListener) != (null);
                    if (productAdapterProductPieceUpdateListenerJavaLangObjectNull) {



                        productAdapterProductPieceUpdateListener.increaseProduct(dataHolder);
                    }
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // productAdapter != null
                boolean productAdapterJavaLangObjectNull = false;
                // productAdapter.productPieceUpdateListener
                com.shopping.app.ui.basket.ProductPieceUpdateListener productAdapterProductPieceUpdateListener = null;
                // productAdapter
                com.shopping.app.ui.basket.adapter.BasketProductsAdapter productAdapter = mProductAdapter;
                // dataHolder
                com.shopping.app.data.model.ProductBasket dataHolder = mDataHolder;
                // productAdapter.productPieceUpdateListener != null
                boolean productAdapterProductPieceUpdateListenerJavaLangObjectNull = false;



                productAdapterJavaLangObjectNull = (productAdapter) != (null);
                if (productAdapterJavaLangObjectNull) {


                    productAdapterProductPieceUpdateListener = productAdapter.getProductPieceUpdateListener();

                    productAdapterProductPieceUpdateListenerJavaLangObjectNull = (productAdapterProductPieceUpdateListener) != (null);
                    if (productAdapterProductPieceUpdateListenerJavaLangObjectNull) {



                        productAdapterProductPieceUpdateListener.reduceProduct(dataHolder);
                    }
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): productAdapter
        flag 1 (0x2L): dataHolder
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}