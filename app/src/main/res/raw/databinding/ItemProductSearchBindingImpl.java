package raw.databinding;
import com.shopping.app.R;
import com.shopping.app.BR;
import com.shopping.app.databinding.ItemProductSearchBinding;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemProductSearchBindingImpl extends ItemProductSearchBinding implements com.shopping.app.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback13;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemProductSearchBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ItemProductSearchBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            );
        this.ivImage.setTag(null);
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.tvPrice.setTag(null);
        this.tvTitle.setTag(null);
        setRootTag(root);
        // listeners
        mCallback13 = new com.shopping.app.generated.callback.OnClickListener(this, 1);
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
        if (BR.searchAdapter == variableId) {
            setSearchAdapter((com.shopping.app.ui.main.search.adapter.SearchAdapter) variable);
        }
        else if (BR.dataHolder == variableId) {
            setDataHolder((com.shopping.app.data.model.Product) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSearchAdapter(@Nullable com.shopping.app.ui.main.search.adapter.SearchAdapter SearchAdapter) {
        this.mSearchAdapter = SearchAdapter;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.searchAdapter);
        super.requestRebind();
    }
    public void setDataHolder(@Nullable com.shopping.app.data.model.Product DataHolder) {
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
        java.lang.Double dataHolderPrice = null;
        com.shopping.app.ui.main.search.adapter.SearchAdapter searchAdapter = mSearchAdapter;
        java.lang.String tvPriceAndroidStringCurrencyUnitDataHolderPrice = null;
        java.lang.String dataHolderImage = null;
        java.lang.String dataHolderTitle = null;
        com.shopping.app.data.model.Product dataHolder = mDataHolder;

        if ((dirtyFlags & 0x6L) != 0) {



                if (dataHolder != null) {
                    // read dataHolder.price
                    dataHolderPrice = dataHolder.getPrice();
                    // read dataHolder.image
                    dataHolderImage = dataHolder.getImage();
                    // read dataHolder.title
                    dataHolderTitle = dataHolder.getTitle();
                }


                // read @android:string/currency_unit
                tvPriceAndroidStringCurrencyUnitDataHolderPrice = tvPrice.getResources().getString(R.string.currency_unit, dataHolderPrice);
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            com.shopping.app.utils.BindingAdapters.loadImage(this.ivImage, dataHolderImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvPrice, tvPriceAndroidStringCurrencyUnitDataHolderPrice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTitle, dataHolderTitle);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback13);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // searchAdapter != null
        boolean searchAdapterJavaLangObjectNull = false;
        // searchAdapter
        com.shopping.app.ui.main.search.adapter.SearchAdapter searchAdapter = mSearchAdapter;
        // dataHolder
        com.shopping.app.data.model.Product dataHolder = mDataHolder;



        searchAdapterJavaLangObjectNull = (searchAdapter) != (null);
        if (searchAdapterJavaLangObjectNull) {



            searchAdapter.goProductDetails(dataHolder);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): searchAdapter
        flag 1 (0x2L): dataHolder
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}