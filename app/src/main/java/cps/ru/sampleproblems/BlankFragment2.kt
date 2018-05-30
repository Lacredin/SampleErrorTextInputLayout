package cps.ru.sampleproblems


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_blank_fragment2.*


class BlankFragment2 : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank_fragment2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fragment_passport_input_serial_text.setOnFocusChangeListener { v, hasFocus ->
            if (hasFocus){
                fragment_passport_input_serial_info.error = null
                fragment_passport_input_date_info.isErrorEnabled = false
            }else{
                fragment_passport_input_date_info.isErrorEnabled = true
                fragment_passport_input_serial_info.error = "Ошибка"
            }
        }

        fragment_passport_input_issued_text.setOnFocusChangeListener { v, hasFocus ->
            if (hasFocus){
                fragment_passport_input_issued_info.error = null
                fragment_passport_input_date_info.isErrorEnabled = false
            }else{
                fragment_passport_input_date_info.isErrorEnabled = true
                fragment_passport_input_issued_info.error = "Ошибка"
            }
        }

        fragment_passport_input_subdivision_text.setOnFocusChangeListener { v, hasFocus ->
            if (hasFocus){
                fragment_passport_input_subdivision_info.error = null
                fragment_passport_input_date_info.isErrorEnabled = false
            }else{
                fragment_passport_input_date_info.isErrorEnabled = true
                fragment_passport_input_subdivision_info.error = "Ошибка"
            }
        }

        fragment_passport_input_date_text.setOnFocusChangeListener { v, hasFocus ->
            if (hasFocus){
                fragment_passport_input_date_info.error = null
                fragment_passport_input_date_info.isErrorEnabled = false
            }else{
                fragment_passport_input_date_info.isErrorEnabled = true
                fragment_passport_input_date_info.error = "Ошибка"
            }
        }
    }
}
