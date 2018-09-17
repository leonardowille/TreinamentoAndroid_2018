package br.com.wille.cwiflix.fragments

import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.wille.cwiflix.R
import br.com.wille.cwiflix.SharedPreferencesService
import br.com.wille.cwiflix.models.Media
import kotlinx.android.synthetic.main.dialog_media.view.*

class MediaDialogFragment: DialogFragment() {

    lateinit var media: Media

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.dialog_media, container, false)

        media.run {
            view.titleTextView.text = this.title
            view.overviewTextView.text = this.overview
            view.releaseDateTextView.text = this.releaseDate
            view.gradeTextView.text = "$grade/10"
            val userGrade = SharedPreferencesService.retrieveFloat(this.id)
            if (userGrade != Float.MIN_VALUE){
                view.userGradeTextView.text = "${(userGrade * 2).toInt()}/10"
                view.ratingBar.rating = userGrade
            }
        }

        view.ratingBar.setOnRatingBarChangeListener { _, rating, _ ->
            view.userGradeTextView.text = "${(rating * 2).toInt()}/10"
            SharedPreferencesService.write(media.id, rating)
        }

        return view
    }
}