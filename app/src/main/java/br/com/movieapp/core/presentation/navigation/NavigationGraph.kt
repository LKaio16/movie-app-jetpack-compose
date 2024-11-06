package br.com.movieapp.core.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import br.com.movieapp.movie_popular_feature.presentation.MoviePopularScreen
import br.com.movieapp.movie_popular_feature.presentation.MoviePopularViewModel


@Composable
fun NavigationGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = BottomNavItem.MoviePopular.route
    ) {

        composable(BottomNavItem.MoviePopular.route) {

            val ViewModel: MoviePopularViewModel = hiltViewModel()
            val uiState = ViewModel.uiState

            MoviePopularScreen(
                uiState = uiState,
                navigationToDetailMovie = {
                }
            )
        }

        composable(BottomNavItem.MovieSearch.route) {

        }

        composable(BottomNavItem.MovieFavorites.route) {

        }
    }
}